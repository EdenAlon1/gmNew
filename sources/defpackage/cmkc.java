package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmkc {
    public static final MessageIdType a(bdhg bdhgVar) {
        bdhgVar.getClass();
        Object m = bdhgVar.m(new Function() { // from class: cmkb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final bdhg bdhgVar2 = (bdhg) obj;
                String[] strArr = btza.a;
                btyv btyvVar = new btyv(btza.a);
                btyvVar.z("getLatestEditMessageId");
                btyvVar.e(new Function() { // from class: cmjz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new btyi[]{((btyh) obj2).b};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btyvVar.x(1);
                buxo d = MessagesTable.d();
                d.u();
                d.h(new Function() { // from class: cmka
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar = (buxz) obj2;
                        buxzVar.G(bdhg.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                btyvVar.G(dtvz.i(d.a(), MessagesTable.c.a, btza.c.a).g());
                dtsu o = btyvVar.a().o();
                try {
                    btyj btyjVar = (btyj) o;
                    if (btyjVar.moveToFirst()) {
                        MessageIdType c = btyjVar.c();
                        ffig.a(o, null);
                        return c;
                    }
                    MessageIdType messageIdType = bdhb.a;
                    ffig.a(o, null);
                    return messageIdType;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ffig.a(o, th);
                        throw th2;
                    }
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        m.getClass();
        return (MessageIdType) m;
    }
}
