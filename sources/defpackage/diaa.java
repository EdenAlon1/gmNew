package defpackage;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class diaa {
    public final dhzq a = new dhzq();
    private final PutDataRequest b;

    private diaa(PutDataRequest putDataRequest) {
        this.b = putDataRequest;
    }

    public static diaa b(String str) {
        return new diaa(PutDataRequest.a(str));
    }

    public final Uri a() {
        return this.b.a;
    }

    public final PutDataRequest c() {
        digh b = digi.b(this.a);
        this.b.c = b.a.toByteArray();
        int size = b.b.size();
        for (int i = 0; i < size; i++) {
            List list = b.b;
            String num = Integer.toString(i);
            Asset asset = (Asset) list.get(i);
            if (num == null) {
                throw new IllegalStateException("asset key cannot be null: ".concat(String.valueOf(String.valueOf(asset))));
            }
            if (asset == null) {
                throw new IllegalStateException("asset cannot be null: key=".concat(num));
            }
            if (Log.isLoggable("DataMap", 3)) {
                Log.d("DataMap", "asPutDataRequest: adding asset: " + num + " " + asset.toString());
            }
            this.b.d(num, asset);
        }
        return this.b;
    }
}
