package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysb {
    public final Map a;
    public final ffbr b;
    public final akmj c;
    private final ffbz d;

    public ysb(Map map, ffbr ffbrVar, akmj akmjVar) {
        ffbrVar.getClass();
        akmjVar.getClass();
        this.a = map;
        this.b = ffbrVar;
        this.c = akmjVar;
        this.d = ffca.a(new ffix() { // from class: ysa
            @Override // defpackage.ffix
            public final Object invoke() {
                ysb ysbVar = ysb.this;
                return Boolean.valueOf(((aurs) ysbVar.b.b()).a() ? ysbVar.c.a() : ysbVar.a.containsKey(cwmn.b));
            }
        });
    }

    private final boolean c() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    public final dszq a(int i) {
        return c() ? new dszn() : new dszo(i);
    }

    public final Integer b() {
        if (c()) {
            return Integer.valueOf(R.drawable.shortcuts_screen_background);
        }
        return null;
    }
}
