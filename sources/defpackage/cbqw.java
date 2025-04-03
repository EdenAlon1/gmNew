package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbqw implements apuh {
    private final cbrb a;

    public cbqw(cbrb cbrbVar) {
        this.a = cbrbVar;
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        String[] strArr = bumm.a;
        bumh bumhVar = new bumh(bumm.a);
        bumhVar.z("LoadStarMessageStateExtension#extendQuery");
        bumhVar.d(new Function() { // from class: cbqv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bulv bulvVar = (bulv) obj;
                return new bulw[]{bulvVar.a, bulvVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.G(dtvz.i(bumhVar.b(), bumm.c.b, MessagesTable.c.a).g());
        return buxoVar;
    }

    @Override // defpackage.apuh
    public final boolean c() {
        return true;
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        String[] strArr = bumm.a;
        apufVar.e(((bulm[]) bindData.aG("message_star", new bulm[0])).length > 0);
    }

    @Override // defpackage.apuh
    public final aptb e() {
        return this.a;
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
