package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aivd implements aivc {
    private final ffbr a;
    private final aiva b;
    private final aium c;
    private final ejlq d;
    private final ejwl e;

    public aivd(ffbr ffbrVar, aiva aivaVar, aium aiumVar, ejlq ejlqVar, ejwl ejwlVar) {
        this.a = ffbrVar;
        this.b = aivaVar;
        this.c = aiumVar;
        this.d = ejlqVar;
        this.e = ejwlVar;
    }

    @Override // defpackage.aivc
    public final void a(aivb aivbVar, Activity activity, bcse bcseVar) {
        emxf.l(aewg.h());
        emxf.l(aewg.i());
        aiva aivaVar = this.b;
        aivaVar.b = activity;
        aivaVar.c = bcseVar;
        this.d.i(ejlp.b(((aeyq) this.a.b()).a(new aeyc(aivbVar.b(), aivbVar.a(), "", buay.USER, buax.HIGH, "", false))), new ejlm(new aiuy(aivbVar.b().b())), this.b);
    }

    @Override // defpackage.aivc
    public final void b(vk vkVar, ute uteVar, boolean z) {
        if (z) {
            aiva aivaVar = this.b;
            aivaVar.a = vkVar;
            aivaVar.d = uteVar;
            this.d.k(aivaVar);
            aium aiumVar = this.c;
            aiumVar.c = vkVar;
            this.e.b(((aitz) aiumVar.a.b()).a(), this.c);
        }
    }
}
