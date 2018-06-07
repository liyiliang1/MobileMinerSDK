package io.waterhole.miner;

import android.app.Application;
import waterhole.miner.monero.XmrMiner;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        XmrMiner.initApplication(this);
    }
}
