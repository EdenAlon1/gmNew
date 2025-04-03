package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbj extends ffkk implements ffji {
    final /* synthetic */ fbo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbj(fbo fboVar) {
        super(1);
        this.a = fboVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jpg jpgVar;
        List list = (List) obj;
        jpg jpgVar2 = this.a.a().b;
        if (jpgVar2 != null) {
            fbo fboVar = this.a;
            jpo jpoVar = fboVar.b;
            ibz ibzVar = fboVar.h;
            jpo z = jpo.z(jpoVar, ibzVar != null ? ibzVar.a() : ibw.h, 0L, null, null, null, 0L, 0, 0L, 16777214);
            jpf jpfVar = jpgVar2.a;
            jpf jpfVar2 = jpgVar2.a;
            jpgVar = jpgVar2.p(new jpf(jpfVar.a, z, jpfVar2.c, jpfVar2.d, jpfVar2.e, jpfVar2.f, jpfVar2.g, jpfVar2.h, jpfVar2.i, jpfVar2.j), jpgVar2.c);
            list.add(jpgVar);
        } else {
            jpgVar = null;
        }
        return Boolean.valueOf(jpgVar != null);
    }
}
