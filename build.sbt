lazy val core = Project("spark-data-generator", file("core"))
  .settings(Settings.core: _*)
  .settings(Defaults.itSettings : _*)