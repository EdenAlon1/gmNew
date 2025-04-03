package androidx.camera.camera2;

import android.content.Context;
import defpackage.atv;
import defpackage.atw;
import defpackage.bcn;
import defpackage.bco;
import defpackage.bfn;
import defpackage.bhk;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Camera2Config$DefaultProvider {
    public atw getCameraXConfig() {
        bco bcoVar = new bco() { // from class: afi
            @Override // defpackage.bco
            public final bcp a(Context context, bde bdeVar, atl atlVar, long j) {
                return new agk(context, bdeVar, atlVar, j);
            }
        };
        bcn bcnVar = new bcn() { // from class: afj
            @Override // defpackage.bcn
            public final aju a(Context context, Object obj, Set set) {
                try {
                    return new aju(context, new ajt(), obj, set);
                } catch (ato e) {
                    throw new avv(e);
                }
            }
        };
        bhk bhkVar = new bhk() { // from class: afk
            @Override // defpackage.bhk
            public final bhl a(Context context) {
                return new ajz(context);
            }
        };
        atv atvVar = new atv();
        atvVar.a.c(atw.a, bcoVar);
        atvVar.a.c(atw.b, bcnVar);
        atvVar.a.c(atw.c, bhkVar);
        return new atw(bfn.f(atvVar.a));
    }
}
