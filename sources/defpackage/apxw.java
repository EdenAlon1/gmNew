package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxw implements apuh {
    private final ffbr a;

    public apxw(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.apuh
    public final buxo a(buxo buxoVar) {
        String[] strArr = btza.a;
        btyv btyvVar = new btyv(btza.a);
        btyvVar.z("+loadEditStatus");
        btyvVar.e(new Function() { // from class: apxt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btyh btyhVar = (btyh) obj;
                return new btyi[]{btyhVar.a, btyhVar.c, btyhVar.d, btyhVar.e};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxoVar.G(dtvz.i(btyvVar.b(), btza.c.b, MessagesTable.c.a).g());
        return buxoVar;
    }

    @Override // defpackage.apuh
    public final /* bridge */ /* synthetic */ boolean c() {
        return ((Boolean) this.a.b()).booleanValue();
    }

    @Override // defpackage.apuh
    public final void d(apuf apufVar, MessagesTable.BindData bindData, aoug aougVar, enhk enhkVar, amfx amfxVar, aptd aptdVar) {
        bindData.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        String[] strArr = btza.a;
        Object[] aG = bindData.aG("message_edits", new btxp[0]);
        aG.getClass();
        apxu apxuVar = new apxu();
        int length = aG.length;
        if (length != 0) {
            aG = Arrays.copyOf(aG, length);
            aG.getClass();
            ffdo.e(aG, apxuVar);
        }
        List c = ffdo.c(aG);
        if (c.isEmpty()) {
            return;
        }
        ((apsm) apufVar).h = new apxv(c);
    }

    @Override // defpackage.apuh
    public final /* synthetic */ aptb e() {
        return new apur("rcs edit");
    }

    @Override // defpackage.apuh
    public final /* synthetic */ bwdf b(bwdf bwdfVar) {
        return bwdfVar;
    }
}
