package defpackage;

import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctox extends emlo {
    private final emmt a;

    public ctox(emmt emmtVar) {
        this.a = emmtVar;
    }

    @Override // defpackage.emlo
    public final excx a(int i, emhv emhvVar) {
        try {
            new HashMap();
            int i2 = emhvVar.b;
            if ((i2 & 1) == 0) {
                if ((i2 & 2) != 0) {
                    return excy.a(i, excw.a(emhvVar.d));
                }
                throw new emlq(a.C(emhvVar, "FileSpec is not supported: "));
            }
            try {
                cgmb i3 = this.a.i(emhvVar);
                try {
                    excx a = excy.a(i, Uri.parse(i3.a()));
                    i3.close();
                    return a;
                } finally {
                }
            } catch (Exception e) {
                if ((emhvVar.b & 2) != 0) {
                    return excy.a(i, excw.a(emhvVar.d));
                }
                throw new emlq(e);
            }
        } catch (Exception e2) {
            throw new emlq(e2);
        }
    }
}
