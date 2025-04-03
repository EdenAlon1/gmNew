package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apyu implements apuh {
    public final asoe a;
    private final Context b;
    private final dran c;
    private final apym d;

    public apyu(Context context, dran dranVar, asoe asoeVar, apym apymVar) {
        context.getClass();
        dranVar.getClass();
        apymVar.getClass();
        this.b = context;
        this.c = dranVar;
        this.a = asoeVar;
        this.d = apymVar;
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        bueb a = bueg.a();
        a.z("MessageReactionsStateExtension.extendQuery");
        a.d(new Function() { // from class: apyh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return apyu.this.a.a() ? new budl[]{bueg.c.c, bueg.c.g} : new budl[]{bueg.c.c};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.G(dtvz.i(a.b(), bueg.c.b, MessagesTable.c.a).g());
        return buxoVar;
    }

    @Override // defpackage.apuh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        cmrl cmrlVar;
        buco bucoVar;
        cmrf m;
        bindData.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        String[] strArr = bueg.a;
        buco[] bucoVarArr = (buco[]) bindData.aG("message_reactions", new buco[0]);
        apxy apxyVar = null;
        if (this.a.a()) {
            bucoVarArr.getClass();
            buco bucoVar2 = (buco) ffdo.H(bucoVarArr);
            if (bucoVar2 != null) {
                bucoVar2.az(6, "animation_effect");
                cmrlVar = bucoVar2.g;
                bucoVarArr.getClass();
                bucoVar = (buco) ffdo.H(bucoVarArr);
                if (bucoVar != null && (m = bucoVar.m()) != null) {
                    apxyVar = new apxy(this.b, aougVar, enhkVar, m, cmrlVar);
                }
                ((apsm) apufVar).b = apxyVar;
            }
        }
        cmrlVar = null;
        bucoVarArr.getClass();
        bucoVar = (buco) ffdo.H(bucoVarArr);
        if (bucoVar != null) {
            apxyVar = new apxy(this.b, aougVar, enhkVar, m, cmrlVar);
        }
        ((apsm) apufVar).b = apxyVar;
    }

    @Override // defpackage.apuh
    public final aptb e() {
        return this.d;
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
