package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccbt {
    public static final cskc a = cskc.g("BugleCms", "CmsBackupDeadLetterQueueManager");
    public final cdfy b;
    public final errl c;
    private final errl d;

    public ccbt(cdfy cdfyVar, errl errlVar, errl errlVar2) {
        this.b = cdfyVar;
        this.c = errlVar;
        this.d = errlVar2;
    }

    public static final bqkw e(int i, int i2) {
        if (i2 == 1) {
            return cctq.b(i);
        }
        if (i2 == 2) {
            return cctq.b(i);
        }
        if (i2 == 3) {
            return cctq.b(i);
        }
        if (i2 == 5) {
            return ccrl.c(i);
        }
        if (i2 == 7) {
            return cclk.e(i);
        }
        csjb e = a.e();
        e.I("Unexpected TableType, returning unknown AbandonedAction");
        e.y("flags", i);
        e.r();
        return bqkw.BACKUP_UNKNOWN_OPERATION;
    }

    public final elfl a(String str) {
        elfl c;
        str.getClass();
        cdfy cdfyVar = this.b;
        c = axol.c(cdfyVar.c, ffhe.a, ffsm.a, new cdfs(cdfyVar, str, null));
        return c;
    }

    public final elfl b(final ccce ccceVar, final Throwable th, boolean z, final int i) {
        emxf.a(ccceVar.g == z);
        return elfo.h(new erog() { // from class: ccbg
            @Override // defpackage.erog
            public final ListenableFuture a() {
                elfl c;
                ccbt ccbtVar = ccbt.this;
                ccce ccceVar2 = ccceVar;
                String c2 = ccbtVar.c(ccceVar2);
                ccceVar2.getClass();
                Throwable th2 = th;
                th2.getClass();
                int i2 = i;
                cdfy cdfyVar = ccbtVar.b;
                c = axol.c(cdfyVar.c, ffhe.a, ffsm.a, new cdfu(cdfyVar, ccceVar2, th2, i2, c2, null));
                return c;
            }
        }, this.d).h(new emwl() { // from class: ccbh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.d);
    }

    public final String c(ccce ccceVar) {
        Object apply;
        if (e(ccceVar.f, ccceVar.d) == bqkw.BACKUP_DELETE) {
            return ccceVar.e;
        }
        int i = ccceVar.d;
        if (i != 1) {
            if (i == 2) {
                final ConversationIdType b = bdgq.b(ccceVar.e);
                Function function = new Function() { // from class: ccbm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bseh) obj).R();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                Supplier supplier = new Supplier() { // from class: ccbn
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        csjb e = ccbt.a.e();
                        e.I("Conversation not found, returning null CMS id");
                        e.c(ConversationIdType.this);
                        e.r();
                        return null;
                    }
                };
                bseh b2 = bsom.b(b);
                return (String) (b2 != null ? function.apply(b2) : supplier.get());
            }
            if (i == 3) {
                final String str = ccceVar.e;
                return (String) ParticipantsTable.m(str, new Function() { // from class: ccbc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((ParticipantsTable.BindData) obj).L();
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Supplier() { // from class: ccbk
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        csjb e = ccbt.a.e();
                        e.I("Participant not found, returning null CMS id");
                        e.f(str);
                        e.r();
                        return null;
                    }
                });
            }
            if (i != 5) {
                if (i != 7) {
                    csjb e = a.e();
                    e.I("Unexpected TableType, returning null CMS id");
                    e.y("TableType", ccceVar.d);
                    e.r();
                    return null;
                }
                final int d = cclk.d(ccceVar.f);
                final int parseInt = Integer.parseInt(ccceVar.e);
                bqwn a2 = bqws.a();
                a2.z("getCmsIdForKeyTypeAndIndex");
                apply = new Function() { // from class: ccbp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bqvx) obj).e;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }.apply(bqws.c);
                bqvy[] bqvyVarArr = {(bqvy) apply};
                int intValue = bqws.c().intValue();
                if (((Integer) bqws.b.getOrDefault(bqvyVarArr[0].toString(), -1)).intValue() > intValue) {
                    dtub.w("columnReference.toString()", intValue);
                }
                a2.m(bqvyVarArr);
                a2.e(new Function() { // from class: ccbq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bqwr bqwrVar = (bqwr) obj;
                        bqwrVar.e(d);
                        bqwrVar.c(parseInt);
                        return bqwrVar;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                });
                bqvj bqvjVar = (bqvj) ((bqvz) a2.b().o()).cQ();
                if (bqvjVar != null) {
                    return bqvjVar.o();
                }
                csjb e2 = a.e();
                e2.I("CMS Key not found, returning null CMS id");
                e2.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, d);
                e2.y("index", parseInt);
                e2.r();
                return null;
            }
        }
        final MessageIdType b3 = bdhb.b(ccceVar.e);
        return (String) MessagesTable.j(b3, new Function() { // from class: ccbi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MessagesTable.BindData) obj).R();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Supplier() { // from class: ccbj
            @Override // java.util.function.Supplier
            public final Object get() {
                csjb e3 = ccbt.a.e();
                e3.I("Message not found, returning null CMS id");
                e3.d(MessageIdType.this);
                e3.r();
                return null;
            }
        });
    }

    public final elfl d(ccce ccceVar, engw engwVar, boolean z, int i) {
        elfl c;
        emxf.a(ccceVar.g == z);
        String c2 = c(ccceVar);
        engwVar.getClass();
        cdfy cdfyVar = this.b;
        c = axol.c(cdfyVar.c, ffhe.a, ffsm.a, new cdfx(cdfyVar, ccceVar, engwVar, i, c2, null));
        return c.h(new emwl() { // from class: ccbo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.d);
    }
}
