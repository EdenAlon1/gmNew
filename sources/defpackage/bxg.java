package defpackage;

import android.util.Range;
import android.util.Size;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxg implements ksz {
    private final String a;
    private final but b;
    private final Size c;
    private final beh d;
    private final aua e;
    private final Range f;
    private final int g;

    public bxg(String str, int i, but butVar, Size size, beh behVar, aua auaVar, Range range) {
        this.a = str;
        this.g = i;
        this.b = butVar;
        this.c = size;
        this.d = behVar;
        this.e = auaVar;
        this.f = range;
    }

    @Override // defpackage.ksz
    public final /* synthetic */ Object a() {
        Range range = this.f;
        int e = this.d.e();
        int intValue = !Objects.equals(range, axt.a) ? ((Integer) this.f.clamp(Integer.valueOf(e))).intValue() : e;
        avw.a("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", Integer.valueOf(intValue), Integer.valueOf(e), Objects.equals(this.f, axt.a) ? this.f : "<UNSPECIFIED>"));
        avw.a("VidEncVdPrflRslvr", a.f(intValue, "Resolved VIDEO frame rate: ", "fps"));
        but butVar = this.b;
        avw.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        beh behVar = this.d;
        aua auaVar = this.e;
        Size size = this.c;
        int a = bxe.a(behVar.b(), auaVar.i, behVar.a(), intValue, behVar.e(), size.getWidth(), behVar.i(), size.getHeight(), behVar.g(), ((bqv) butVar).c);
        beh behVar2 = this.d;
        String str = this.a;
        int h = behVar2.h();
        cai d = bxe.d(str, h);
        String str2 = this.a;
        cag l = cah.l();
        l.e(str2);
        l.d(this.g);
        l.g(this.c);
        l.b(a);
        l.c(intValue);
        l.f(h);
        ((bxn) l).b = d;
        return l.a();
    }
}
