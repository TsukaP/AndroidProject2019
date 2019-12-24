package jp.co.tsuka.androidproject2019.ui

import androidx.lifecycle.ViewModel
import jp.co.tsuka.androidproject2019.api.MainService
import javax.inject.Inject

class MainViewModel @Inject constructor(mainService: MainService) : ViewModel()
