package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccij {
    private static final cskc a = cskc.g("BugleCms", "CmsConversationConsumer");
    private final ffbr b;
    private final ffbr c;

    public ccij(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public static ConversationIdType a(bseh bsehVar, String str) {
        efbd.b();
        try {
            ConversationIdType D = bsehVar.D();
            if (!D.b()) {
                return D;
            }
            csjb e = a.e();
            e.I("Insert conversation failed");
            e.A("cms_id", str);
            e.r();
            throw new ceev();
        } catch (Throwable th) {
            if ((asvl.a() || csgj.a()) && (th instanceof Error)) {
                throw th;
            }
            csjb e2 = a.e();
            e2.I("Insert conversation threw");
            e2.A("cms_id", str);
            e2.s(th);
            throw new ceew(th);
        }
    }

    public static void b(ConversationIdType conversationIdType) {
        efbd.b();
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("markConversationRestoreComplete");
        bsoeVar.l(csgg.RESTORED_FROM_CMS);
        bsoeVar.f(conversationIdType);
    }

    public static void d(crwz crwzVar, final ConversationIdType conversationIdType) {
        efbd.b();
        bscj[] bscjVarArr = (bscj[]) Collection.EL.stream(crwzVar.c()).map(new Function() { // from class: ccif
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bscn o = ((bscj) obj).o();
                o.d(ConversationIdType.this);
                return o.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: ccig
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new bscj[i];
            }
        });
        bsdr.b(0, bscjVarArr);
        brww.f(0, (brvg[]) DesugarArrays.stream(bscjVarArr).map(new Function() { // from class: ccih
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bscj bscjVar = (bscj) obj;
                String[] strArr = brww.a;
                brvj brvjVar = new brvj();
                brvjVar.b(bscjVar.m());
                brvjVar.c(bscjVar.k());
                brvjVar.d(bscjVar.l());
                return brvjVar.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray(new IntFunction() { // from class: ccii
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return new brvg[i];
            }
        }));
    }

    public final void c(ConversationIdType conversationIdType, bseh bsehVar) {
        efbd.b();
        ((bczy) this.b.b()).V(conversationIdType, bsehVar.H() == byyy.NAME_IS_AUTOMATIC ? null : bsehVar.X(), bsehVar.k(), true);
        csjb c = a.c();
        c.I("Refreshing conversation");
        c.A("conv_id", conversationIdType);
        c.r();
        ((bdfl) this.c.b()).b(conversationIdType, false, null);
    }
}
