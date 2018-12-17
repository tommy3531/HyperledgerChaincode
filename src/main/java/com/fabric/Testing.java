package com.fabric;

import com.fabric.client.CAClientWrapper;
import com.fabric.client.ChannelWrapper;
import com.fabric.network.LoadConnectionProfile;
import org.hyperledger.fabric.sdk.NetworkConfig;
import org.hyperledger.fabric_ca.sdk.HFCAClient;

import java.util.List;

public class Testing {

    public static void main(String args[]) throws Exception {
        String org = "org1";
        String userName = "Ankur";


        NetworkConfig connectionProfile = LoadConnectionProfile.getConfig();
        System.out.println(connectionProfile.getEventHubNames());




    }

}
