package defpackage;

import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eikl implements eikp {
    public static final /* synthetic */ int a = 0;
    private static final eikk b;
    private static final eikk c;
    private static final eikk d;
    private static final eikk e;
    private static final eikk f;
    private static final eikk g;
    private static final engw h;

    static {
        eikk d2 = eikk.d(eijn.a, ChatMessage.class, new Supplier() { // from class: eikd
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eijn();
            }
        });
        b = d2;
        eikk d3 = eikk.d(eiju.a, IsComposingMessage.class, new Supplier() { // from class: eike
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eiju();
            }
        });
        c = d3;
        eikk d4 = eikk.d(eijr.a, FileTransferInformation.class, new Supplier() { // from class: eikf
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eijr();
            }
        });
        d = d4;
        eikk d5 = eikk.d(eijm.a, BasicTextMessage.class, new Supplier() { // from class: eikg
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eijm();
            }
        });
        e = d5;
        eikk d6 = eikk.d(eijw.a, MessageReceipt.class, new Supplier() { // from class: eikh
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eijw();
            }
        });
        f = d6;
        eikk d7 = eikk.d(eijv.a, LocationInformation.class, new Supplier() { // from class: eiki
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eijv();
            }
        });
        g = d7;
        h = engw.w(d3, d4, d5, d6, d7, d2);
    }

    @Override // defpackage.eikp
    public final eiko a(final ContentType contentType) {
        return ((eikk) Collection.EL.stream(h).filter(new Predicate() { // from class: eikj
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = eikl.a;
                return ((eikk) obj).a().f(ContentType.this);
            }
        }).findAny().orElse(b)).e();
    }

    @Override // defpackage.eikp
    public final eiko b(final Class cls) {
        return ((eikk) Collection.EL.stream(h).filter(new Predicate() { // from class: eikb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = eikl.a;
                return ((eikk) obj).b().getName().equals(cls.getName());
            }
        }).findAny().orElseThrow(new Supplier() { // from class: eikc
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = eikl.a;
                return new eikr(cls);
            }
        })).e();
    }
}
