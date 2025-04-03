package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apwm implements apuh {
    public final cqoh a;
    private final apwq b;

    public apwm(apwq apwqVar, cqoh cqohVar) {
        apwqVar.getClass();
        cqohVar.getClass();
        this.b = apwqVar;
        this.a = cqohVar;
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        btql b = btqq.b();
        b.z("PreviewMessageStateExtension#extendQuery");
        b.d(new Function() { // from class: apwk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btpq btpqVar = (btpq) obj;
                return new btpr[]{btpqVar.a, btpqVar.e, btpqVar.f, btpqVar.h, btpqVar.g, btpqVar.i, btpqVar.c, btpqVar.j, btpqVar.k, btpqVar.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.G(dtvz.i(b.b(), btqq.c.b, MessagesTable.c.a).g());
        return buxoVar;
    }

    @Override // defpackage.apuh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        bindData.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        String[] strArr = btqq.a;
        bton[] btonVarArr = (bton[]) bindData.aG("link_preview", new bton[0]);
        btonVarArr.getClass();
        bton btonVar = (bton) ffdo.H(btonVarArr);
        ((apsm) apufVar).a = btonVar != null ? new apwl(btonVar, this) : null;
    }

    @Override // defpackage.apuh
    public final aptb e() {
        return this.b;
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
