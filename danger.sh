#!/usr/bin/env bash
# Done run against develop, staging and master branches
if [[  "${CIRCLE_BRANCH}" == "develop" ]] || [[  "${CIRCLE_BRANCH}" == "master" ]]; then
    echo "nothing to check"
    exit 0
fi

curl -sSLO https://github.com/pinterest/ktlint/releases/download/0.35.0/ktlint &&
  chmod a+x ktlint &&
  sudo mv ktlint /usr/local/bin/

./gradlew ktlint
gem install bundler
bundle install
bundle exec danger
