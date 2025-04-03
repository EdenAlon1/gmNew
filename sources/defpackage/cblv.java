package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cblv extends ceut {
    public static final cskc a = cskc.g("Bugle", "RichCardMediaUriCleanupHandler");
    public final cbgf b;
    private final errl c;

    public cblv(errl errlVar, cbgf cbgfVar) {
        this.c = errlVar;
        this.b = cbgfVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("RichCardMediaUriCleanupHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cblx.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final cblx cblxVar = (cblx) eyhsVar;
        final String str = cblxVar.b;
        if (TextUtils.isEmpty(str)) {
            a.r("empty uri was requested to be cleaned up");
            return elfo.e(ceyt.k());
        }
        if (!TextUtils.isEmpty(cblxVar.c)) {
            return elfo.g(new Callable() { // from class: cblr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final MessageIdType b = bdhb.b(cblxVar.c);
                    csjb c = cblv.a.c();
                    c.I("removing obsolete uri");
                    c.d(b);
                    c.r();
                    String[] strArr = PartsTable.a;
                    bwdi bwdiVar = new bwdi();
                    bwdiVar.ap("RichCardMediaUriCleanupHandler#processPendingWorkItemAsync1");
                    bwdiVar.A();
                    final String str2 = str;
                    bwdiVar.D(new Function() { // from class: cbls
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bwdm bwdmVar = (bwdm) obj;
                            bwdmVar.n(MessageIdType.this);
                            bwdmVar.v(Uri.parse(str2));
                            return bwdmVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bwdiVar.b().e();
                    final cblv cblvVar = cblv.this;
                    Consumer consumer = new Consumer() { // from class: cblt
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ConversationIdType C = ((MessagesTable.BindData) obj).C();
                            if (C.b()) {
                                return;
                            }
                            cblv.this.b.l(C, b, new String[0]);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    Runnable runnable = new Runnable() { // from class: cblu
                        @Override // java.lang.Runnable
                        public final void run() {
                            csjb e = cblv.a.e();
                            e.I("message not found");
                            e.d(MessageIdType.this);
                            e.r();
                        }
                    };
                    MessagesTable.BindData b2 = MessagesTable.b(b);
                    if (b2 != null) {
                        consumer.o(b2);
                    } else {
                        runnable.run();
                    }
                    return ceyt.i();
                }
            }, this.c);
        }
        a.r("empty message id when requesting URI cleanup");
        return elfo.e(ceyt.k());
    }
}
