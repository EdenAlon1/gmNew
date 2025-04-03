package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feqf extends fecc {
    final /* synthetic */ feqg a;

    public feqf(feqg feqgVar) {
        this.a = feqgVar;
    }

    @Override // defpackage.fecc
    public final String a() {
        return this.a.b;
    }

    @Override // defpackage.fecc
    public final void d(feby febyVar) {
        febz febzVar = new febz();
        febzVar.a = new fedm(null, Collections.singletonList(new fdyw(this.a.a)));
        febzVar.b = fdxd.a;
        febyVar.a(febzVar.a());
    }

    @Override // defpackage.fecc
    public final void c() {
    }
}
