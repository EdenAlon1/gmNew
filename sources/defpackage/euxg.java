package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<euxg> CREATOR = new euxh();
    public final Bundle a;
    private Map b;

    public euxg(Bundle bundle) {
        this.a = bundle;
    }

    private static final int e(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public final int a() {
        String string = this.a.getString("google.original_priority");
        if (string == null) {
            string = this.a.getString("google.priority");
        }
        return e(string);
    }

    public final int b() {
        String string = this.a.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.a.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.a.getString("google.priority");
        }
        return e(string);
    }

    public final Map c() {
        if (this.b == null) {
            Bundle bundle = this.a;
            cmh cmhVar = new cmh();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        cmhVar.put(str, str2);
                    }
                }
            }
            this.b = cmhVar;
        }
        return this.b;
    }

    public final byte[] d() {
        return this.a.getByteArray("rawData");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.p(parcel, 2, this.a);
        dfxk.c(parcel, a);
    }
}
