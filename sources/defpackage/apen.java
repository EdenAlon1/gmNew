package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apen implements apuh {
    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        Object apply;
        String[] strArr = btul.a;
        btui btuiVar = new btui(btul.a);
        btuiVar.z("MessageCaptionLoadExtension#extendQuery");
        apply = new Function() { // from class: apem
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bttw bttwVar = (bttw) obj;
                return new bttx[]{bttwVar.a, bttwVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(btul.c);
        btuiVar.c((bttx[]) apply);
        buxoVar.G(dtvz.i(btuiVar.b(), btul.c.a, MessagesTable.c.a).g());
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
        String[] strArr = btul.a;
        bttn[] bttnVarArr = (bttn[]) bindData.aG("message_captions", new bttn[0]);
        bttnVarArr.getClass();
        bttn bttnVar = (bttn) ffdo.H(bttnVarArr);
        ((apsm) apufVar).d = bttnVar != null ? bttnVar.k() : null;
    }

    @Override // defpackage.apuh
    public final /* synthetic */ aptb e() {
        return new apur("message caption");
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
