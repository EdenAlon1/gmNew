package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csks implements cskj {
    public static final cfva a = cfvl.i(cfvl.b, "enable_unredacted_phone_numbers_feedback_data", false);
    public final errl b;
    public final comc c;
    private final entd d = entd.c("Bugle");
    private final errl e;
    private final ejlc f;

    public csks(ffbr ffbrVar, errl errlVar, errl errlVar2) {
        this.e = errlVar;
        this.b = errlVar2;
        comy comyVar = (comy) ffbrVar.b();
        comu c = comv.c();
        c.d(comb.PII_LOG_BRIDGE);
        c.f(cskl.a);
        this.c = comyVar.a(c.a());
        this.f = new ejlc(new erog() { // from class: cskm
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final csks csksVar = csks.this;
                return csksVar.c.h().i(new eroh() { // from class: cskr
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        cskl csklVar = (cskl) obj;
                        if ((csklVar.b & 1) != 0 && !csklVar.c.isEmpty()) {
                            return erqt.i(csklVar.c);
                        }
                        csks csksVar2 = csks.this;
                        return csksVar2.c.j(new emwl() { // from class: cskn
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                cfva cfvaVar = csks.a;
                                cskk cskkVar = (cskk) ((cskl) obj2).toBuilder();
                                String uuid = UUID.randomUUID().toString();
                                cskkVar.copyOnWrite();
                                cskl csklVar2 = (cskl) cskkVar.instance;
                                uuid.getClass();
                                csklVar2.b |= 1;
                                csklVar2.c = uuid;
                                return (cskl) cskkVar.build();
                            }
                        }).h(new emwl() { // from class: csko
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return ((cskl) obj2).c;
                            }
                        }, csksVar2.b);
                    }
                }, csksVar.b);
            }
        }, errlVar2);
    }

    @Override // defpackage.cskj
    public final CharSequence a(final CharSequence charSequence, int i) {
        final String concat;
        if (!((Boolean) a.e()).booleanValue() || !this.f.c().isDone()) {
            return cskt.b(charSequence);
        }
        if (i - 1 == 1) {
            try {
                String str = (String) erqt.q(this.f.c());
                if (charSequence == null) {
                    concat = null;
                } else if (TextUtils.isEmpty(str)) {
                    concat = cskt.b(charSequence);
                } else {
                    int i2 = eodh.a;
                    concat = "Redacted-".concat(eodf.a.c(((String) charSequence).concat(String.valueOf(str)), StandardCharsets.UTF_8).toString());
                }
                ekzz f = eleg.f("PiiLogBridgeImpl#syncToDatabase");
                try {
                    elfl g = elfo.g(new Callable() { // from class: cskp
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Object apply;
                            cfva cfvaVar = csks.a;
                            String[] strArr = bwjh.a;
                            bwii bwiiVar = new bwii();
                            final CharSequence charSequence2 = charSequence;
                            bwiiVar.b(charSequence2.toString());
                            bwiiVar.c(concat.toString());
                            final bwif a2 = bwiiVar.a();
                            apply = new Function() { // from class: cskq
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bwjg bwjgVar = (bwjg) obj;
                                    cfva cfvaVar2 = csks.a;
                                    bwjgVar.aq(new dtrt("pii_hash.hash_key", 1, String.valueOf(charSequence2.toString())));
                                    return bwjgVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            }.apply(new bwjg());
                            final bwjf bwjfVar = new bwjf((bwjg) apply);
                            final dtve a3 = bwjh.a();
                            Boolean bool = (Boolean) a3.q(new emyl() { // from class: bwic
                                @Override // defpackage.emyl
                                public final Object get() {
                                    String[] strArr2 = bwjh.a;
                                    bwje bwjeVar = new bwje();
                                    final bwif bwifVar = bwif.this;
                                    bwifVar.az(1, "timestamp");
                                    Instant instant = bwifVar.b;
                                    if (instant == null) {
                                        bwjeVar.a.putNull("timestamp");
                                    } else {
                                        bwjeVar.a.put("timestamp", Long.valueOf(bdgw.a(instant)));
                                    }
                                    bwjf bwjfVar2 = bwjfVar;
                                    bwifVar.az(2, "hash_value");
                                    dtub.u(bwjeVar.a, "hash_value", bwifVar.c);
                                    bwifVar.az(3, "hash_key");
                                    dtub.u(bwjeVar.a, "hash_key", bwifVar.d);
                                    bwjeVar.al();
                                    bwjeVar.af(bwjfVar2);
                                    bwjeVar.an(new dtui("pii_hash", "-updateOrInsert-update"));
                                    if (bwjeVar.b().e() != 0) {
                                        return true;
                                    }
                                    final dtve dtveVar = a3;
                                    return Boolean.valueOf(dtub.b(bwjh.a(), "pii_hash", bwifVar, new Function() { // from class: bwid
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            return Long.valueOf(dtve.this.R("pii_hash", (ContentValues) obj));
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }, new Consumer() { // from class: bwie
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj) {
                                            Long l = (Long) obj;
                                            if (l.longValue() >= 0) {
                                                bwif bwifVar2 = bwif.this;
                                                bwifVar2.a = new bwib(l).a.longValue();
                                                bwifVar2.fY(0);
                                            }
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    }) != -1);
                                }
                            });
                            bool.booleanValue();
                            return bool;
                        }
                    }, this.e);
                    f.b(g);
                    g.k(axnw.b(), this.b);
                    f.close();
                    return concat;
                } finally {
                }
            } catch (ExecutionException e) {
                ((ensz) ((ensz) ((ensz) this.d.j()).g(e)).h("com/google/android/apps/messaging/shared/util/common/PiiLogBridgeImpl", "sanitizePii", 's', "PiiLogBridgeImpl.java")).q("Failed to get salt for sanitize pii.");
            }
        }
        return cskt.b(charSequence);
    }
}
