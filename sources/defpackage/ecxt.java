package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecxt {
    public final eoeg a = eoeg.f;
    private final emyl b;
    private final emyl c;

    public ecxt(final eyee eyeeVar, final String str, final String str2) {
        this.b = emys.a(new emyl() { // from class: ecxr
            @Override // defpackage.emyl
            public final Object get() {
                return ecxt.this.a.j(eyeeVar.I());
            }
        });
        this.c = emys.a(new emyl() { // from class: ecxs
            @Override // defpackage.emyl
            public final Object get() {
                int i = eodh.a;
                int i2 = eodr.a;
                eodq eodqVar = new eodq();
                eodqVar.j(str.getBytes());
                eodqVar.c((byte) 0);
                eodqVar.j(str2.getBytes());
                return ecxt.this.a.j(eodqVar.q().e());
            }
        });
    }

    public final File a() {
        return new File(((String) this.b.get()) + "/" + ((String) this.c.get()) + ".pb");
    }
}
