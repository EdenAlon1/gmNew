package defpackage;

import android.content.ContentValues;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import j$.util.DesugarArrays;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cciu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ccix b;
    final /* synthetic */ String c;
    final /* synthetic */ bqmn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cciu(ccix ccixVar, String str, bqmn bqmnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ccixVar;
        this.c = str;
        this.d = bqmnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cciu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final ccix ccixVar = this.b;
            String str = this.c;
            bqmn bqmnVar = this.d;
            this.a = 1;
            ccix.a.p(a.o(bqmnVar, str, "Inserting deleted message entry with message ID ", " and deletion reason "));
            long epochMilli = ccixVar.b.f().toEpochMilli();
            if (((asjm) ccixVar.e.b()).a()) {
                epochMilli = Instant.ofEpochMilli(epochMilli).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
            }
            String[] strArr = bqmm.a;
            final bqli bqliVar = new bqli();
            bqliVar.d(Long.parseLong(str));
            bqliVar.b(epochMilli);
            bqliVar.c(bqmnVar);
            elfl b = ccixVar.j.b("CmsDeletedMessagesBufferPersister#insertDeletedMessageEntry", new Runnable() { // from class: ccio
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr2 = bqmm.a;
                    bqmj bqmjVar = new bqmj(bqmm.a);
                    bqmjVar.z("CmsDeletedMessagesBufferPersister#insertDeletedMessageEntry");
                    if (bqmjVar.b().i() == ccix.this.h) {
                        bqmj bqmjVar2 = new bqmj(bqmm.a);
                        bqmjVar2.z("CmsDeletedMessagesBufferPersister#evictOldestMessageDeletedEntry#getEntry");
                        bqmjVar2.C((String) DesugarArrays.stream(new bqmg[]{new bqmg(bqmm.b.a)}).map(new Function() { // from class: bqmi
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((bqmg) obj3).a();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining(", ")));
                        bqmjVar2.x(1);
                        bqmjVar2.r();
                        bqlv bqlvVar = (bqlv) bqmjVar2.b().p(bqmm.b.a);
                        try {
                            engw c = bqlvVar.c();
                            bqlvVar.close();
                            final Long l = (Long) c.get(0);
                            bqmd bqmdVar = new bqmd();
                            bqmdVar.f("CmsDeletedMessagesBufferPersister#evictOldestMessageDeletedEntry#deleteEntry");
                            bqmdVar.a(new Function() { // from class: ccip
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj3) {
                                    bqml bqmlVar = (bqml) obj3;
                                    Long l2 = l;
                                    l2.longValue();
                                    bqmlVar.aq(new dtwe("cms_deleted_messages_buffer._id", 1, l2));
                                    return bqmlVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bqmdVar.d();
                        } catch (Throwable th) {
                            try {
                                bqlvVar.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    final bqld a = bqliVar.a(new Supplier() { // from class: bqlf
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new bqle();
                        }
                    });
                    final dtve a2 = bqmm.a();
                    dtub.b(bqmm.a(), "cms_deleted_messages_buffer", a, new Function() { // from class: bqlc
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            return Long.valueOf(dtve.this.S("cms_deleted_messages_buffer", (ContentValues) obj3));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Consumer() { // from class: bqla
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj3) {
                            Long l2 = (Long) obj3;
                            if (l2.longValue() >= 0) {
                                bqld bqldVar = bqld.this;
                                bqldVar.a = new bqlb(l2).a.longValue();
                                bqldVar.fY(0);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
            });
            b.getClass();
            Object c = fgfz.c(b, this);
            if (c != ffhh.a) {
                c = ffcu.a;
            }
            if (c == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cciu(this.b, this.c, this.d, ffguVar);
    }
}
