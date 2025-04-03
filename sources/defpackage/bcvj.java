package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcvj extends cslh {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ bcvr a;
    private final boolean c;
    private final bcvk k;
    private final String l;
    private final List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcvj(bcvr bcvrVar, boolean z, bcvk bcvkVar, bcpu bcpuVar) {
        super("Bugle.Async.Compose.DraftMessageData.checkDraftForAction.Duration");
        this.a = bcvrVar;
        this.c = z;
        this.k = bcvkVar;
        this.l = bcpuVar.b();
        this.m = new ArrayList(bcvrVar.r);
        bcvrVar.w = this;
    }

    @Override // defpackage.cslh
    protected final /* synthetic */ Object a(Object[] objArr) {
        bcvr bcvrVar;
        ekzz f;
        bcvq bcvqVar;
        ekzz f2 = eleg.f("CheckDraftForSendTask::doInBackgroundTimed");
        try {
            try {
                if (this.c) {
                    csix.h();
                    if ((((Boolean) cjja.a.e()).booleanValue() ? (int) Collection.EL.stream(this.m).filter(new Predicate() { // from class: bcvh
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
                            int i = bcvj.b;
                            return !((MessagePartCoreData) obj).bm();
                        }
                    }).count() : this.m.size()) <= this.a.l()) {
                        bcvr bcvrVar2 = this.a;
                        if (bcvrVar2.h) {
                            int b2 = bcvrVar2.C.b(-1);
                            Iterator it = this.m.iterator();
                            while (it.hasNext()) {
                                if (((MessagePartCoreData) it.next()).n() > b2) {
                                }
                            }
                        } else {
                            covn b3 = bcvrVar2.D.b(this.m, bcvrVar2.o);
                            if (b3.c()) {
                                csjb c = bcvr.b.c();
                                c.I("Draft is over MMS limit after compression.");
                                c.z("required", ((cotm) b3).a);
                                c.z("max", ((cotm) b3).b);
                                c.m(this.a.o);
                                c.r();
                            }
                        }
                        f2.close();
                        return bcvqVar;
                    }
                    bcvqVar = bcvq.MESSAGE_OVER_LIMIT;
                    f2.close();
                    return bcvqVar;
                }
                if (!bcvrVar.h) {
                    boolean ad = bcvrVar.ad();
                    bcvr bcvrVar3 = this.a;
                    cpbn a = bcvrVar3.z.a(bcvrVar3.o);
                    bcvr bcvrVar4 = this.a;
                    String str = bcvrVar4.l;
                    cpbw cpbwVar = bcvrVar4.A;
                    if (!cpbwVar.f.a(bcvrVar4.o).q(cpbwVar.c.getResources().getString(R.string.sms_7bit_confirmed_pref_key), false) && !TextUtils.isEmpty(str) && !ad && a.w()) {
                        bcvr bcvrVar5 = this.a;
                        if (bcvrVar5.A.e(bcvrVar5.o)) {
                            bcvr bcvrVar6 = this.a;
                            if (!str.equals(bcvrVar6.E.a(bcvrVar6.B, str))) {
                                bcvqVar = bcvq.NEED_TO_CONFIRM_SMS_ENCODING;
                                f2.close();
                                return bcvqVar;
                            }
                        }
                    }
                }
                final cnmd cnmdVar = this.a.y;
                if (cnmdVar == null) {
                    f.close();
                } else {
                    buxo d = MessagesTable.d();
                    d.z("isReplyToMissingMessage");
                    d.h(new Function() { // from class: bcvi
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            buxz buxzVar = (buxz) obj;
                            int i = bcvj.b;
                            buxzVar.q(cnmd.this.b);
                            return buxzVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    boolean V = d.b().V();
                    f.close();
                    if (V) {
                        bcvqVar = bcvq.IS_REPLY_TO_MISSING_MESSAGE;
                        f2.close();
                        return bcvqVar;
                    }
                }
                bcvqVar = bcvq.PASSED;
                f2.close();
                return bcvqVar;
            } finally {
            }
            bcvrVar = this.a;
            f = eleg.f("CheckDraftForSendTask#isReplyToMissingMessage");
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cslh
    protected final /* synthetic */ void d(Object obj) {
        bcvq bcvqVar = (bcvq) obj;
        ekzz f = eleg.f("CheckDraftForSendTask::doPostExecute");
        try {
            bcvr bcvrVar = this.a;
            bcvrVar.w = null;
            if (!bcvrVar.j(this.l) || isCancelled()) {
                if (!this.a.j(this.l)) {
                    bcvr.b.r("Message can't be sent: draft not bound.");
                }
                if (isCancelled()) {
                    bcvr.b.r("Message can't be sent: draft is cancelled.");
                }
            } else {
                this.k.a(this.a, bcvqVar);
            }
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

    @Override // android.os.AsyncTask
    protected final void onCancelled() {
        this.a.w = null;
    }
}
