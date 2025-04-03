package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import defpackage.fidy;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ApkAssets {
    private static String a;

    public static long[] open(String str, String str2) {
        long[] jArr;
        AssetFileDescriptor assetFileDescriptor = null;
        a = null;
        try {
            try {
                Context context = fidy.a;
                if (!TextUtils.isEmpty(str2)) {
                    int i = BundleUtils.a;
                }
                assetFileDescriptor = context.getAssets().openNonAssetFd(str);
                jArr = new long[]{assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
            } finally {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e) {
                        Log.e("cn_ApkAssets", "Unable to close AssetFileDescriptor", e);
                    }
                }
            }
        } catch (IOException e2) {
            a = "Error while loading asset " + str + " from " + str2 + ": " + e2.toString();
            if (!e2.getMessage().equals("") && !e2.getMessage().equals(str)) {
                Log.e("cn_ApkAssets", a);
            }
            jArr = new long[]{-1, -1, -1};
        }
        return jArr;
    }

    private static String takeLastErrorString() {
        String str = a;
        a = null;
        return str;
    }
}
