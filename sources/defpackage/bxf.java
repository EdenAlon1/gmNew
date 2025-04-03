package defpackage;

import android.util.Range;
import android.util.Size;
import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxf implements ksz {
    private static final Size a = new Size(1280, 720);
    private static final Range b = new Range(1, 60);
    private final String c;
    private final but d;
    private final Size e;
    private final aua f;
    private final Range g;
    private final int h;

    public bxf(String str, int i, but butVar, Size size, aua auaVar, Range range) {
        this.c = str;
        this.h = i;
        this.d = butVar;
        this.e = size;
        this.f = auaVar;
        this.g = range;
    }

    @Override // defpackage.ksz
    public final /* synthetic */ Object a() {
        Integer num;
        int intValue = !Objects.equals(this.g, axt.a) ? ((Integer) b.clamp((Integer) this.g.getUpper())).intValue() : 30;
        avw.a("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", Integer.valueOf(intValue), Objects.equals(this.g, axt.a) ? this.g : "<UNSPECIFIED>"));
        avw.a("VidEncCfgDefaultRslvr", a.f(intValue, "Resolved VIDEO frame rate: ", "fps"));
        but butVar = this.d;
        avw.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        aua auaVar = this.f;
        Size size = this.e;
        int i = auaVar.i;
        int width = size.getWidth();
        Size size2 = a;
        int a2 = bxe.a(14000000, i, 8, intValue, 30, width, size2.getWidth(), this.e.getHeight(), size2.getHeight(), ((bqv) butVar).c);
        String str = this.c;
        aua auaVar2 = this.f;
        Map map = (Map) cao.e.get(str);
        int i2 = -1;
        if (map != null && (num = (Integer) map.get(auaVar2)) != null) {
            i2 = num.intValue();
        }
        String str2 = this.c;
        cai d = bxe.d(str2, i2);
        cag l = cah.l();
        l.e(str2);
        l.d(this.h);
        l.g(this.e);
        l.b(a2);
        l.c(intValue);
        l.f(i2);
        ((bxn) l).b = d;
        return l.a();
    }
}
