package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoup implements alyv {
    private static final alya c = new alya() { // from class: aoui
        @Override // defpackage.alya
        public final int d() {
            return 2;
        }
    };
    public final cnvv a;
    public final MessagesTable.BindData b;
    private final ConversationId d;
    private final ffbz e;
    private final ffbz f = ffca.b(3, new ffix() { // from class: aouk
        @Override // defpackage.ffix
        public final Object invoke() {
            return new CoreBugleMessageId(aoup.this.b.D(), -1L);
        }
    });
    private final ffbz g = ffca.b(3, new ffix() { // from class: aoul
        @Override // defpackage.ffix
        public final Object invoke() {
            return Instant.ofEpochMilli(aoup.this.b.w());
        }
    });
    private final ffbz h = ffca.b(3, new ffix() { // from class: aoum
        @Override // defpackage.ffix
        public final Object invoke() {
            return Instant.ofEpochMilli(aoup.this.b.y());
        }
    });
    private final ffbz i = ffca.b(3, new ffix() { // from class: aoun
        @Override // defpackage.ffix
        public final Object invoke() {
            return apvq.a(aoup.this.b.l());
        }
    });
    private final ffbz j = ffca.b(3, new ffix() { // from class: aouo
        @Override // defpackage.ffix
        public final Object invoke() {
            return MessageData.aq(aoup.this.b.l());
        }
    });
    private final alya k = c;
    private final int m = 2;
    private final int n = 1;
    private final aqge l = new aqgf(0);

    public aoup(final apnr apnrVar, ConversationId conversationId, cnvv cnvvVar) {
        this.d = conversationId;
        this.a = cnvvVar;
        this.b = cnvvVar.a;
        this.e = ffca.b(3, new ffix() { // from class: aouj
            @Override // defpackage.ffix
            public final Object invoke() {
                apug apugVar;
                aoup aoupVar = this;
                PartsTable.BindData[] bindDataArr = aoupVar.a.b;
                bindDataArr.getClass();
                engw c2 = engq.c(bindDataArr);
                String q = aoupVar.q();
                if (q != null) {
                    apuf n = apug.n();
                    ((apsm) n).d = q;
                    apugVar = n.a();
                } else {
                    apugVar = apug.n;
                }
                return apnr.this.a(aoupVar.b, c2, apugVar);
            }
        });
    }

    @Override // defpackage.alxr
    public final /* bridge */ /* synthetic */ apxv A() {
        return null;
    }

    @Override // defpackage.alxr
    public final int B() {
        return this.m;
    }

    @Override // defpackage.alxr
    public final int C() {
        return this.n;
    }

    @Override // defpackage.alyv
    public final Instant D() {
        Instant l = this.a.c.l();
        l.getClass();
        return l;
    }

    @Override // defpackage.alxr
    public final alxq a() {
        Object a = this.i.a();
        a.getClass();
        return (alxq) a;
    }

    @Override // defpackage.alxr
    public final /* bridge */ /* synthetic */ MessageId b() {
        Object a = this.f.a();
        a.getClass();
        return (CoreBugleMessageId) a;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ alxz c() {
        return null;
    }

    @Override // defpackage.alxr
    public final alya d() {
        return this.k;
    }

    @Override // defpackage.alxr
    public final /* bridge */ /* synthetic */ alyu e() {
        return null;
    }

    @Override // defpackage.alxr
    public final ConversationId f() {
        return this.d;
    }

    @Override // defpackage.alxr
    public final /* bridge */ /* synthetic */ appj g() {
        Object a = this.e.a();
        a.getClass();
        return (appj) a;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ appu h() {
        return null;
    }

    @Override // defpackage.alxr
    public final /* bridge */ /* synthetic */ apyd i() {
        return null;
    }

    @Override // defpackage.alxr
    public final /* bridge */ /* synthetic */ aqcm j() {
        return null;
    }

    @Override // defpackage.alxr
    public final aqge k(int i) {
        int i2 = engw.d;
        return new aqgf(enou.a);
    }

    @Override // defpackage.alxr
    public final aqge l() {
        return this.l;
    }

    @Override // defpackage.alxr
    public final /* bridge */ /* synthetic */ elfl m() {
        throw new UnsupportedOperationException("This is not supported for scheduled messages");
    }

    @Override // defpackage.alxr
    public final Instant n() {
        Object a = this.g.a();
        a.getClass();
        return (Instant) a;
    }

    @Override // defpackage.alxr
    public final Instant o() {
        Object a = this.h.a();
        a.getClass();
        return (Instant) a;
    }

    @Override // defpackage.alxr
    public final Long p() {
        long A = this.b.A();
        if (A == 0) {
            return null;
        }
        return Long.valueOf(A);
    }

    @Override // defpackage.alxr
    public final String q() {
        return this.a.f();
    }

    @Override // defpackage.alxr
    public final String r() {
        Object a = this.j.a();
        a.getClass();
        return (String) a;
    }

    @Override // defpackage.alxr
    public final boolean s(aqux aquxVar) {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean t() {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean u(aqux aquxVar) {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean v() {
        return false;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean x() {
        return false;
    }

    @Override // defpackage.alxr
    public final boolean y() {
        return false;
    }

    @Override // defpackage.alxr
    public final /* synthetic */ aqdr z() {
        return null;
    }
}
