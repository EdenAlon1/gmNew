package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqam implements aqge {
    public final ffsk a;
    public final becj b;
    public final MessageId c;
    public ctbx d;
    public final ctbl e;
    public final bufr f;
    public final buxm g;
    private final ffsk h;

    public aqam(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, becj becjVar, MessageId messageId) {
        ffskVar.getClass();
        ffskVar2.getClass();
        ctbkVar.getClass();
        becjVar.getClass();
        this.h = ffskVar;
        this.a = ffskVar2;
        this.b = becjVar;
        this.c = messageId;
        this.e = ctbkVar.a(new aqaj(this));
        String[] strArr = bufy.a;
        bufs bufsVar = new bufs(bufy.a);
        bufsVar.z("MessageReplyCountObserver#repliesQuery");
        bufsVar.d(new Function() { // from class: aqae
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bufe) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bufsVar.e(new Function() { // from class: aqaf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                MessageIdType c;
                bufx bufxVar = (bufx) obj;
                MessageId messageId2 = aqam.this.c;
                apah apahVar = messageId2 instanceof apah ? (apah) messageId2 : null;
                if (apahVar == null || (c = apahVar.c()) == null) {
                    throw new IllegalStateException("Unsupported message id type.");
                }
                bufxVar.b(c);
                return bufxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bufr b = bufsVar.b();
        this.f = b;
        buxo d = MessagesTable.d();
        d.z("MessageReplyCountObserver#replyIdsQuery");
        d.x(100);
        d.f(new Function() { // from class: aqag
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((buum) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: aqah
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.B(false);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.G(dtvz.i(b, bufy.c.a, MessagesTable.c.a).g());
        this.g = d.b();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.e.a(new ctbf() { // from class: aqad
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "MessageReplyCountObservableSupplier::register", "MessageReplyCountObservableSupplier::callback", "MessageReplyCountObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new aqai(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
