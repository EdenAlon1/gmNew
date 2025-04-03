package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwh extends upp {
    private final ffbr A;
    private final errl B;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final uwm p;
    public final int q;
    public final int r;
    public final int s;
    public elfl t;
    public elfl u;
    public boolean v;
    public elfl w;
    public boolean x;
    public elfl y;
    private final Executor z;

    public uwh(uwn uwnVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, elbx elbxVar, ffbr ffbrVar4, azei azeiVar, ffbr ffbrVar5, errl errlVar, Context context, ConversationIdType conversationIdType, mz mzVar, int i, int i2, int i3) {
        super(elbxVar, context, conversationIdType, mzVar, azeiVar);
        this.v = true;
        this.x = true;
        csix.q(i);
        this.l = ffbrVar;
        this.n = ffbrVar2;
        this.o = ffbrVar3;
        this.m = ffbrVar4;
        this.q = i;
        this.r = i2;
        this.s = i3;
        this.A = ffbrVar5;
        this.B = errlVar;
        Executor e = ((bdmz) ffbrVar2.b()).e();
        this.z = e;
        uwe uweVar = new uwe(this);
        elbx elbxVar2 = (elbx) uwnVar.a.b();
        elbxVar2.getClass();
        e.getClass();
        this.p = new uwm(elbxVar2, context, conversationIdType, e, uweVar);
    }

    static boolean o(List list, int i) {
        return list == null || list.size() < i;
    }

    private final bcse p(bcse bcseVar) {
        bcse bcseVar2 = (bcse) this.h.get(bcseVar.u());
        return bcseVar2 == null ? (bcse) this.i.get(bcseVar.w()) : bcseVar2;
    }

    private final elfl q() {
        elfl e;
        ekzz f = eleg.f("MessageListWindowManager#loadLatest");
        try {
            csix.g();
            if (!this.j.get() && this.x) {
                m();
                elfl c = ((bdmz) this.n.b()).c(this.c, bdhb.a, this.q);
                emwl emwlVar = new emwl() { // from class: uwc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        uwh uwhVar = uwh.this;
                        List list = (List) obj;
                        uwhVar.x = false;
                        if (uwh.o(list, uwhVar.q)) {
                            csjy.i("BugleDataModel", "We reached the end for load latest (i.e. we loaded everything and not just latest).");
                            uwhVar.v = false;
                        }
                        if (list == null || list.isEmpty()) {
                            csjy.c("BugleDataModel", "No results returned for load latest.");
                            return true;
                        }
                        csjy.i("BugleDataModel", list.size() + " results retrieved for load latest.");
                        uwhVar.l(list);
                        uwhVar.t = null;
                        return true;
                    }
                };
                Handler handler = cslq.a;
                e = c.h(emwlVar, new cslp());
                this.t = e;
                f.b(e);
                f.close();
                return e;
            }
            csjy.d("BugleDataModel", "Bailing on loadLatest because the object is either destroyed: %b. Or there is no more messages to be loaded: %b.", Boolean.valueOf(this.j.get()), Boolean.valueOf(!this.x));
            e = elfo.e(false);
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.upp
    protected final void d() {
        if (this.j.get()) {
            csjy.c("BugleDataModel", "Ignoring onMessageChange because the manager is destroyed.");
        } else {
            axnw.h(elfo.f(new Runnable() { // from class: uwg
                @Override // java.lang.Runnable
                public final void run() {
                    csix.h();
                    final uwh uwhVar = uwh.this;
                    if (uwhVar.j.get()) {
                        csjy.c("BugleDataModel", "Ignoring drainTheQueueAndUpdateMessages because the manager is destroyed.");
                        return;
                    }
                    final HashSet hashSet = new HashSet();
                    uwhVar.e.drainTo(hashSet);
                    if (hashSet.isEmpty()) {
                        csjy.c("BugleDataModel", "Empty queue, bailing in drainTheQueueAndUpdateMessages.");
                        return;
                    }
                    csjy.i("BugleDataModel", "Processing changed messages for ".concat(String.valueOf(TextUtils.join(",", hashSet))));
                    final List list = (List) Collection.EL.stream(((bdjk) uwhVar.l.b()).c(hashSet)).map(new Function() { // from class: uwa
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bcse bcseVar = (bcse) ((bcyh) obj);
                            ((bdjj) uwh.this.m.b()).a(bcseVar);
                            return bcseVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toList());
                    efbd.a().post(eldl.l(new Runnable() { // from class: uwb
                        @Override // java.lang.Runnable
                        public final void run() {
                            uwh.this.n(list, hashSet);
                        }
                    }));
                }
            }, this.z));
        }
    }

    @Override // defpackage.upp
    protected final void f(final MessageIdType messageIdType, final bdhg bdhgVar) {
        efbd.a().postAtFrontOfQueue(eldl.l(new Runnable() { // from class: uwf
            @Override // java.lang.Runnable
            public final void run() {
                ekzz f = eleg.f("MessageListWindowManager::refreshStatusOfMessages::mainThread");
                bdhg bdhgVar2 = bdhgVar;
                MessageIdType messageIdType2 = messageIdType;
                uwh uwhVar = uwh.this;
                try {
                    uwhVar.f.f();
                    int i = 0;
                    while (true) {
                        mz mzVar = uwhVar.f;
                        if (i >= mzVar.g) {
                            break;
                        }
                        bcse bcseVar = (bcse) mzVar.e(i);
                        if (!bdhgVar2.k() || !bdhgVar2.equals(bcseVar.w())) {
                            if (!messageIdType2.c() && messageIdType2.equals(bcseVar.u())) {
                                csjy.c("BugleDataModel", a.C(messageIdType2, "refreshStatusOfMessages, messageId="));
                                bcseVar.ae();
                                uwhVar.f.k(i, bcseVar);
                                break;
                            }
                            i++;
                        } else {
                            csjy.c("BugleDataModel", a.C(bdhgVar2, "refreshStatusOfMessages, rcsMessageId="));
                            bcseVar.ae();
                            uwhVar.f.k(i, bcseVar);
                            break;
                        }
                    }
                    uwhVar.f.h();
                    f.close();
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [fazb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [fazb, java.lang.Object] */
    @Override // defpackage.upp
    protected final void g(final MessageCoreData messageCoreData) {
        if (!messageCoreData.cX() || messageCoreData.E().i()) {
            return;
        }
        ekzz f = eleg.f("MessageListWindowManager::onPendingNewMessage");
        try {
            bcsf bcsfVar = (bcsf) this.A.b();
            crji crjiVar = (crji) bcsfVar.a.b();
            crjiVar.getClass();
            bcwz bcwzVar = (bcwz) bcsfVar.b.b();
            bcwzVar.getClass();
            bdjs bdjsVar = (bdjs) bcsfVar.c.b();
            bdjsVar.getClass();
            bzqa bzqaVar = (bzqa) bcsfVar.d.b();
            bzqaVar.getClass();
            caao caaoVar = (caao) bcsfVar.e.b();
            caaoVar.getClass();
            aolr aolrVar = (aolr) bcsfVar.f.b();
            aolrVar.getClass();
            ?? b = bcsfVar.g.b();
            b.getClass();
            ffbr ffbrVar = bcsfVar.h;
            ffbr ffbrVar2 = bcsfVar.i;
            cbwg cbwgVar = (cbwg) bcsfVar.j.b();
            cbwgVar.getClass();
            cbvv cbvvVar = (cbvv) bcsfVar.k.b();
            cbvvVar.getClass();
            ?? b2 = bcsfVar.l.b();
            b2.getClass();
            ((auod) bcsfVar.m.b()).getClass();
            final bcse bcseVar = new bcse(crjiVar, bcwzVar, bdjsVar, bzqaVar, caaoVar, aolrVar, (fazb) b, ffbrVar, ffbrVar2, cbwgVar, cbvvVar, (fazb) b2, messageCoreData);
            elfo.f(new Runnable() { // from class: uvw
                @Override // java.lang.Runnable
                public final void run() {
                    emxf.l(efbd.g());
                    ekzz f2 = eleg.f("MessageListWindowManager::insertPendingRcsMessage::mainThread");
                    bcse bcseVar2 = bcseVar;
                    MessageCoreData messageCoreData2 = messageCoreData;
                    uwh uwhVar = uwh.this;
                    try {
                        if (!uwhVar.j.get() && !uwhVar.i.containsKey(messageCoreData2.E())) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(bcseVar2.u());
                            int i = engw.d;
                            uwhVar.n(enou.a, new HashSet());
                            uwhVar.n(engw.r(bcseVar2), hashSet);
                        }
                        f2.close();
                    } catch (Throwable th) {
                        try {
                            f2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.B);
            f.close();
        } finally {
        }
    }

    public final bcse h() {
        csix.g();
        mz mzVar = this.f;
        if (mzVar.g == 0) {
            return null;
        }
        return (bcse) mzVar.e(0);
    }

    public final bcse i() {
        csix.g();
        mz mzVar = this.f;
        int i = mzVar.g;
        if (i == 0) {
            return null;
        }
        return (bcse) mzVar.e(i - 1);
    }

    public final elfl j(final MessageIdType messageIdType) {
        elfl h;
        super.c();
        csix.g();
        if (messageIdType.c()) {
            return q();
        }
        ekzz f = eleg.f("MessageListWindowManager#loadAround");
        try {
            csix.g();
            if (this.j.get()) {
                csjy.c("BugleDataModel", "Bailing for loadAround because the object is destroyed.");
                h = elfo.e(false);
            } else if (((bcse) this.h.get(messageIdType)) != null) {
                csjy.d("BugleDataModel", "Bailing for loadAround because message id %s is already loaded.", messageIdType);
                h = elfo.e(false);
            } else {
                csjy.d("BugleDataModel", "loadAroundFuture starts with conversationId: %s, messageId: %s, chunkSize: %s", this.c, messageIdType, Integer.valueOf(this.q));
                m();
                elfl c = ((bdmz) this.n.b()).c(this.c, messageIdType, this.q);
                emwl emwlVar = new emwl() { // from class: uvx
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        int i;
                        uwh uwhVar = uwh.this;
                        int i2 = uwhVar.q;
                        List list = (List) obj;
                        if (i2 % 2 == 0) {
                            i2++;
                        }
                        MessageIdType messageIdType2 = messageIdType;
                        if (uwh.o(list, i2)) {
                            csjy.d("BugleDataModel", "results less than requested. results: %s, expectedToBeLoaded: %s", list, Integer.valueOf(i2));
                            if (!messageIdType2.c() && list != null && !list.isEmpty()) {
                                i = 0;
                                while (i < list.size()) {
                                    if (messageIdType2.equals(((bcse) list.get(i)).u())) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                            i = -1;
                            Integer valueOf = Integer.valueOf(i);
                            csjy.d("BugleDataModel", "messagePosition: %s", valueOf);
                            if (i == -1) {
                                csjy.o("BugleDataModel", "Nothing was loaded around %s.", messageIdType2);
                            } else {
                                csix.l(list);
                                int size = (list.size() - i) - 1;
                                csjy.d("BugleDataModel", "numberOfNewerMessages: %s, numberOfOlderMessages: %s.", valueOf, Integer.valueOf(size));
                                if (i < uwhVar.q / 2) {
                                    csjy.j("BugleDataModel", "We reached the end for load around %s on the newer messages side (bottom of the screen). Set thereIsDataAfter false", messageIdType2);
                                    uwhVar.x = false;
                                }
                                if (size < uwhVar.q / 2) {
                                    csjy.j("BugleDataModel", "We reached the end for load around %s on the older messages side (top of the screen). Set thereIsDataBefore false", messageIdType2);
                                    uwhVar.v = false;
                                }
                                csix.k((uwhVar.x && uwhVar.v) ? false : true);
                            }
                        }
                        if (list == null || list.isEmpty()) {
                            csjy.i("BugleDataModel", "No results returned for load around ".concat(String.valueOf(messageIdType2.b())));
                            return true;
                        }
                        csjy.i("BugleDataModel", list.size() + " results retrieved for load around " + messageIdType2.b());
                        uwhVar.l(list);
                        uwhVar.u = null;
                        return true;
                    }
                };
                Handler handler = cslq.a;
                h = c.h(emwlVar, new cslp());
                this.u = h;
                f.b(h);
            }
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(List list, bcse bcseVar) {
        csix.g();
        csjy.c("BugleDataModel", "addMessages starts");
        this.f.f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bcse bcseVar2 = (bcse) it.next();
            if (p(bcseVar2) == null) {
                this.f.a(bcseVar2);
                e(bcseVar2);
            } else {
                csjy.c("BugleDataModel", String.format("Ignoring modified message %s. Content observer will pick up the change.", bcseVar2.u()));
            }
        }
        a(this.f.d(bcseVar), bcseVar);
        this.f.h();
    }

    public final void l(List list) {
        csix.g();
        csjy.c("BugleDataModel", "setMessages starts");
        this.f.g();
        this.h.clear();
        this.i.clear();
        this.f.f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((bcse) it.next());
        }
        mz mzVar = this.f;
        Object[] array = list.toArray((Object[]) Array.newInstance((Class<?>) mzVar.h, list.size()));
        mzVar.j();
        if (array.length != 0) {
            Arrays.sort(array, mzVar.f);
            int i = 0;
            int i2 = 0;
            int i3 = 1;
            for (int i4 = 1; i4 < array.length; i4++) {
                Object obj = array[i4];
                if (mzVar.f.compare(array[i2], obj) == 0) {
                    int i5 = i2;
                    while (true) {
                        if (i5 >= i3) {
                            i5 = -1;
                            break;
                        } else if (mzVar.f.f(array[i5], obj)) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i5 != -1) {
                        array[i5] = obj;
                    } else {
                        int i6 = i3 + 1;
                        if (i3 != i4) {
                            array[i3] = obj;
                        }
                        i3 = i6;
                    }
                } else {
                    int i7 = i3 + 1;
                    if (i3 != i4) {
                        array[i3] = obj;
                    }
                    int i8 = i3;
                    i3 = i7;
                    i2 = i8;
                }
            }
            if (mzVar.g == 0) {
                mzVar.a = array;
                mzVar.g = i3;
                mzVar.f.b(0, i3);
            } else {
                boolean z = mzVar.f instanceof mx;
                if (!z) {
                    mzVar.f();
                }
                mzVar.b = mzVar.a;
                mzVar.c = 0;
                int i9 = mzVar.g;
                mzVar.d = i9;
                mzVar.a = (Object[]) Array.newInstance((Class<?>) mzVar.h, i9 + i3 + 10);
                mzVar.e = 0;
                while (true) {
                    int i10 = mzVar.c;
                    int i11 = mzVar.d;
                    if (i10 >= i11 && i >= i3) {
                        break;
                    }
                    if (i10 == i11) {
                        int i12 = i3 - i;
                        System.arraycopy(array, i, mzVar.a, mzVar.e, i12);
                        int i13 = mzVar.e + i12;
                        mzVar.e = i13;
                        mzVar.g += i12;
                        mzVar.f.b(i13 - i12, i12);
                        break;
                    }
                    if (i == i3) {
                        int i14 = i11 - i10;
                        System.arraycopy(mzVar.b, i10, mzVar.a, mzVar.e, i14);
                        mzVar.e += i14;
                        break;
                    }
                    Object obj2 = mzVar.b[i10];
                    Object obj3 = array[i];
                    int compare = mzVar.f.compare(obj2, obj3);
                    if (compare > 0) {
                        i++;
                        Object[] objArr = mzVar.a;
                        int i15 = mzVar.e;
                        mzVar.e = i15 + 1;
                        objArr[i15] = obj3;
                        mzVar.g++;
                        mzVar.f.b(i15, 1);
                    } else if (compare == 0 && mzVar.f.f(obj2, obj3)) {
                        i++;
                        Object[] objArr2 = mzVar.a;
                        int i16 = mzVar.e;
                        mzVar.e = i16 + 1;
                        objArr2[i16] = obj3;
                        mzVar.c++;
                        if (!mzVar.f.e(obj2, obj3)) {
                            my myVar = mzVar.f;
                            int i17 = mzVar.e - 1;
                            myVar.g(obj2, obj3);
                            myVar.a(i17, 1, null);
                        }
                    } else {
                        Object[] objArr3 = mzVar.a;
                        int i18 = mzVar.e;
                        mzVar.e = i18 + 1;
                        objArr3[i18] = obj2;
                        mzVar.c++;
                    }
                }
                mzVar.b = null;
                if (!z) {
                    mzVar.h();
                }
            }
        }
        this.f.h();
    }

    public final void m() {
        csjy.c("BugleDataModel", "Stopping all background operations. Set thereIsDataAfter true, Set thereIsDataBefore true.");
        this.x = true;
        elfl elflVar = this.y;
        if (elflVar != null) {
            elflVar.cancel(true);
            this.y = null;
        }
        this.v = true;
        elfl elflVar2 = this.w;
        if (elflVar2 != null) {
            elflVar2.cancel(true);
            this.w = null;
        }
        elfl elflVar3 = this.u;
        if (elflVar3 != null) {
            elflVar3.cancel(true);
            this.u = null;
        }
        elfl elflVar4 = this.t;
        if (elflVar4 != null) {
            elflVar4.cancel(true);
            this.t = null;
        }
    }

    public final void n(List list, Set set) {
        boolean z;
        csix.g();
        this.f.f();
        Iterator it = list.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                bcse bcseVar = (bcse) it.next();
                if (this.c.equals(bcseVar.t())) {
                    boolean z2 = this.f.g > 0 && bcseVar.aH(i());
                    boolean z3 = this.f.g > 0 && bcseVar.aE(h());
                    mz mzVar = this.f;
                    int i = mzVar.g;
                    boolean z4 = i >= 2 ? !(i().aE(bcseVar) || h().aH(bcseVar)) : i == 1 && bcseVar.a((bcse) mzVar.e(0)) == 0;
                    bcse p = p(bcseVar);
                    if (z4 || ((z2 && !this.v) || (z3 && !this.x))) {
                        csjy.i("BugleDataModel", "Message " + String.valueOf(bcseVar.u()) + " processed.");
                        set.remove(bcseVar.u());
                        if (p != null) {
                            int d = this.f.d(p);
                            csix.g();
                            this.f.k(d, bcseVar);
                            e(bcseVar);
                            if (p.i() != bcseVar.i()) {
                                mz mzVar2 = this.f;
                                mzVar2.j();
                                Object e = mzVar2.e(d);
                                mzVar2.i(d, false);
                                int b = mzVar2.b(e, false);
                                if (d != b) {
                                    mzVar2.f.c(d, b);
                                }
                                int d2 = this.f.d(bcseVar);
                                super.b(d);
                                a(d2, bcseVar);
                            } else {
                                this.f.k(d, bcseVar);
                                a(d, bcseVar);
                            }
                        } else {
                            csix.g();
                            e(bcseVar);
                            int a = this.f.a(bcseVar);
                            e(bcseVar);
                            a(a, bcseVar);
                        }
                    } else {
                        csjy.i("BugleDataModel", "Message " + String.valueOf(bcseVar.u()) + " ignore because it falls outside of the maintained window. TimeStamp: " + bcseVar.i() + "thereIsDataBefore: " + this.v + "thereIsDataAfter: " + this.x);
                        if (this.f.g > 0) {
                            bcse h = h();
                            h.getClass();
                            String valueOf = String.valueOf(h.u());
                            bcse h2 = h();
                            h2.getClass();
                            long i2 = h2.i();
                            bcse i3 = i();
                            i3.getClass();
                            String valueOf2 = String.valueOf(i3.u());
                            bcse i4 = i();
                            i4.getClass();
                            csjy.i("BugleDataModel", "NewestMessage: message " + valueOf + " TimeStamp: " + i2 + "OldestMessage: message " + valueOf2 + " TimeStamp: " + i4.i());
                        }
                    }
                    if (this.f.g == 0) {
                        z = true;
                    }
                } else {
                    csjy.j("BugleDataModel", "Message %s moved to another conversation.", bcseVar.u());
                }
            }
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            MessageIdType messageIdType = (MessageIdType) it2.next();
            bcse bcseVar2 = (bcse) this.h.get(messageIdType);
            if (bcseVar2 != null) {
                this.h.remove(messageIdType);
                this.i.remove(bcseVar2.w());
                int d3 = this.f.d(bcseVar2);
                csix.k(d3 != -1);
                mz mzVar3 = this.f;
                mzVar3.j();
                mzVar3.e(d3);
                mzVar3.i(d3, true);
                super.b(d3);
            }
        }
        this.f.h();
        if (z) {
            csjy.i("BugleDataModel", "Loading latest because there was no message loaded and we received an update.");
            q();
        }
    }
}
