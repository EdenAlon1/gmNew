package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckjh implements ckju {
    private static final cskc d = cskc.g("BugleDataModel", "DefaultRcsConversationAndThreadIdGetterImpl");
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/rcs/conversation/DefaultRcsConversationAndThreadIdGetterImpl");
    public final ffbr a;
    public final ffbr b;
    public final atlx c;
    private final errl f;
    private final ckjt g;
    private final clbd h;
    private final akzt i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ckkl n;
    private final fazb o;

    public ckjh(errl errlVar, ckjt ckjtVar, clbd clbdVar, akzt akztVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ckkl ckklVar, ffbr ffbrVar6, fazb fazbVar, atlx atlxVar) {
        this.f = errlVar;
        this.g = ckjtVar;
        this.h = clbdVar;
        this.i = akztVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = ffbrVar3;
        this.a = ffbrVar4;
        this.m = ffbrVar5;
        this.n = ckklVar;
        this.b = ffbrVar6;
        this.o = fazbVar;
        this.c = atlxVar;
    }

    private static engw e(bsol bsolVar) {
        bsob e2 = bsom.e();
        e2.z("+queryConversationsTableWithIdAndThreadIdProjection");
        e2.f(new Function() { // from class: ckii
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskp bskpVar = (bskp) obj;
                return new bskq[]{bskpVar.a, bskpVar.b};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e2.h(bsolVar);
        return e2.b().y();
    }

    private static engw f(ckjd ckjdVar, Optional optional) {
        ckhl ckhlVar = (ckhl) ckjdVar;
        engw engwVar = ckhlVar.a;
        if (engwVar.size() == 1) {
            csjb a = d.a();
            a.I("Single conversation matched by all parameters query.");
            a.r();
            optional.ifPresent(new Consumer() { // from class: ckhs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.b |= 256;
                    epbzVar.k = 1;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: ckiu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.h = 1;
                    epbzVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return engwVar;
        }
        Optional optional2 = ckhlVar.b;
        if (optional2.isPresent() && ((engw) optional2.get()).size() == 1) {
            csjb a2 = d.a();
            a2.I("Single conversation matched by global identifiers fallback query.");
            a2.r();
            optional.ifPresent(new Consumer() { // from class: ckiv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.b |= 256;
                    epbzVar.k = 1;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: ckiw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.h = 2;
                    epbzVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (engw) optional2.get();
        }
        Optional optional3 = ckhlVar.c;
        if (optional3.isPresent() && ((engw) optional3.get()).size() == 1) {
            csjb a3 = d.a();
            a3.I("Single conversation matched by session ID fallback query.");
            a3.r();
            optional.ifPresent(new Consumer() { // from class: ckix
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.b |= 256;
                    epbzVar.k = 1;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: ckiy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.h = 3;
                    epbzVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (engw) optional3.get();
        }
        Optional optional4 = ckhlVar.d;
        if (optional4.isPresent()) {
            final int size = ((engw) optional4.get()).size();
            csjb a4 = d.a();
            a4.y("NumberOfConversationsMatched", size);
            a4.I("Multiple conversations matched by Telephony fallback query.");
            a4.r();
            optional.ifPresent(new Consumer() { // from class: ckht
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.b |= 256;
                    epbzVar.k = size;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: ckhu
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.h = 5;
                    epbzVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (engw) optional4.get();
        }
        if (optional2.isPresent() && !((engw) optional2.get()).isEmpty()) {
            final int size2 = ((engw) optional2.get()).size();
            csjb a5 = d.a();
            a5.y("NumberOfConversationsMatched", size2);
            a5.I("Multiple conversations matched by global identifiers fallback query.");
            a5.r();
            optional.ifPresent(new Consumer() { // from class: ckhv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.b |= 256;
                    epbzVar.k = size2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: ckhw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.h = 2;
                    epbzVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (engw) optional2.get();
        }
        if (optional3.isPresent() && !((engw) optional3.get()).isEmpty()) {
            final int size3 = ((engw) optional3.get()).size();
            csjb a6 = d.a();
            a6.y("NumberOfConversationsMatched", size3);
            a6.I("Multiple conversations matched by session ID fallback query.");
            a6.r();
            optional.ifPresent(new Consumer() { // from class: ckid
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.b |= 256;
                    epbzVar.k = size3;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optional.ifPresent(new Consumer() { // from class: ckio
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.h = 3;
                    epbzVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return (engw) optional3.get();
        }
        final int size4 = engwVar.size();
        csjb a7 = d.a();
        a7.y("NumberOfConversationsMatched", size4);
        a7.I("Multiple conversations matched by all parameters query.");
        a7.r();
        optional.ifPresent(new Consumer() { // from class: ckis
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                epbv epbvVar = (epbv) obj;
                epbvVar.copyOnWrite();
                epbz epbzVar = (epbz) epbvVar.instance;
                epbz epbzVar2 = epbz.a;
                epbzVar.b |= 256;
                epbzVar.k = size4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        if (size4 > 0) {
            optional.ifPresent(new Consumer() { // from class: ckit
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    epbv epbvVar = (epbv) obj;
                    epbvVar.copyOnWrite();
                    epbz epbzVar = (epbz) epbvVar.instance;
                    epbz epbzVar2 = epbz.a;
                    epbzVar.h = 1;
                    epbzVar.b |= 32;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return engwVar;
    }

    private final void g(final boolean z, boolean z2, Optional optional) {
        if (optional.isEmpty()) {
            return;
        }
        Object obj = optional.get();
        ((eyfq) obj).copyOnWrite();
        epbz epbzVar = (epbz) ((epbv) obj).instance;
        epbz epbzVar2 = epbz.a;
        epbzVar.b |= 128;
        epbzVar.j = z2;
        final ckkl ckklVar = this.n;
        final epbz epbzVar3 = (epbz) ((eyfq) optional.get()).build();
        ((ensz) ckkl.a.n().h("com/google/android/apps/messaging/shared/rcs/conversation/analytics/RcsGroupResolutionAnalytics", "logRcsGroupResolution", 45, "RcsGroupResolutionAnalytics.java")).q("Sending GroupResolution event to Clearcut");
        ckklVar.b.o(new Supplier() { // from class: ckkk
            @Override // java.util.function.Supplier
            public final Object get() {
                eomj eomjVar = (eomj) eomn.a.createBuilder();
                eomjVar.copyOnWrite();
                eomn eomnVar = (eomn) eomjVar.instance;
                eomnVar.c = 10;
                eomnVar.b |= 1;
                eomjVar.copyOnWrite();
                eomn eomnVar2 = (eomn) eomjVar.instance;
                eomnVar2.d = (true != z ? 3 : 2) - 1;
                eomnVar2.b |= 2;
                ckkl ckklVar2 = ckkl.this;
                eoqk a = ckklVar2.d.a(ckklVar2.c.a(ckcf.r));
                eomjVar.copyOnWrite();
                eomn eomnVar3 = (eomn) eomjVar.instance;
                eomnVar3.e = a;
                eomnVar3.b |= 4;
                eqwf a2 = ((ckgv) ckklVar2.e.b()).a();
                eomjVar.copyOnWrite();
                eomn eomnVar4 = (eomn) eomjVar.instance;
                eomnVar4.f = a2.N;
                eomnVar4.b |= 8;
                eomjVar.copyOnWrite();
                eomn eomnVar5 = (eomn) eomjVar.instance;
                epbz epbzVar4 = epbzVar3;
                epbzVar4.getClass();
                eomnVar5.k = epbzVar4;
                eomnVar5.b |= 512;
                return (eomn) eomjVar.build();
            }
        });
    }

    @Override // defpackage.ckju
    public final ConversationIdType a(ckjz ckjzVar) {
        crme c = c(ckjzVar);
        return c == null ? bdgq.a : c.a();
    }

    public final cpxu b(ConversationIdType conversationIdType) {
        if (((Boolean) ayhv.d.e()).booleanValue()) {
            return ((ayfi) this.m.b()).a(conversationIdType);
        }
        bseh b = bsom.b(conversationIdType);
        return b != null ? b.M() : new cpxu();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x09f6, code lost:
    
        if (r4 != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x005e, code lost:
    
        if (((java.lang.Boolean) defpackage.ayhz.e.e()).booleanValue() != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a5f A[Catch: all -> 0x0c68, TryCatch #3 {all -> 0x0c68, blocks: (B:75:0x0694, B:77:0x0843, B:81:0x084e, B:84:0x0859, B:86:0x08a7, B:87:0x08fc, B:90:0x0906, B:91:0x0927, B:93:0x0959, B:94:0x0a11, B:96:0x0a23, B:98:0x0a2a, B:102:0x0a4c, B:105:0x0a57, B:113:0x0967, B:115:0x097e, B:116:0x098f, B:118:0x099a, B:119:0x09a9, B:121:0x09b4, B:122:0x09c3, B:124:0x09ce, B:125:0x09dd, B:127:0x09e8, B:128:0x09f8, B:129:0x09fb, B:132:0x08b3, B:134:0x08d1, B:135:0x08ee, B:136:0x0a5f, B:138:0x0a6e, B:141:0x0abf, B:142:0x0aba, B:143:0x0ac5, B:146:0x0ae3, B:148:0x0b1d, B:149:0x0b41, B:152:0x0b4a, B:153:0x0b8b, B:155:0x0bae, B:160:0x0bff, B:162:0x0c0d, B:163:0x0c20, B:164:0x0bef, B:166:0x0b6e, B:168:0x0c23, B:170:0x0c29, B:172:0x0c2f, B:175:0x0c40, B:178:0x0c46, B:180:0x0c54, B:238:0x06b0, B:239:0x06bb, B:244:0x06bc, B:246:0x06d0, B:249:0x06ee, B:251:0x071f, B:254:0x073c, B:257:0x0758, B:259:0x0772, B:262:0x079f, B:264:0x07bb, B:268:0x07c8, B:270:0x07d8, B:271:0x07f6, B:273:0x07fc, B:274:0x080e, B:276:0x0816, B:277:0x0829, B:278:0x07cc), top: B:7:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0c29 A[Catch: all -> 0x0c68, TryCatch #3 {all -> 0x0c68, blocks: (B:75:0x0694, B:77:0x0843, B:81:0x084e, B:84:0x0859, B:86:0x08a7, B:87:0x08fc, B:90:0x0906, B:91:0x0927, B:93:0x0959, B:94:0x0a11, B:96:0x0a23, B:98:0x0a2a, B:102:0x0a4c, B:105:0x0a57, B:113:0x0967, B:115:0x097e, B:116:0x098f, B:118:0x099a, B:119:0x09a9, B:121:0x09b4, B:122:0x09c3, B:124:0x09ce, B:125:0x09dd, B:127:0x09e8, B:128:0x09f8, B:129:0x09fb, B:132:0x08b3, B:134:0x08d1, B:135:0x08ee, B:136:0x0a5f, B:138:0x0a6e, B:141:0x0abf, B:142:0x0aba, B:143:0x0ac5, B:146:0x0ae3, B:148:0x0b1d, B:149:0x0b41, B:152:0x0b4a, B:153:0x0b8b, B:155:0x0bae, B:160:0x0bff, B:162:0x0c0d, B:163:0x0c20, B:164:0x0bef, B:166:0x0b6e, B:168:0x0c23, B:170:0x0c29, B:172:0x0c2f, B:175:0x0c40, B:178:0x0c46, B:180:0x0c54, B:238:0x06b0, B:239:0x06bb, B:244:0x06bc, B:246:0x06d0, B:249:0x06ee, B:251:0x071f, B:254:0x073c, B:257:0x0758, B:259:0x0772, B:262:0x079f, B:264:0x07bb, B:268:0x07c8, B:270:0x07d8, B:271:0x07f6, B:273:0x07fc, B:274:0x080e, B:276:0x0816, B:277:0x0829, B:278:0x07cc), top: B:7:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c3f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0c46 A[Catch: all -> 0x0c68, TryCatch #3 {all -> 0x0c68, blocks: (B:75:0x0694, B:77:0x0843, B:81:0x084e, B:84:0x0859, B:86:0x08a7, B:87:0x08fc, B:90:0x0906, B:91:0x0927, B:93:0x0959, B:94:0x0a11, B:96:0x0a23, B:98:0x0a2a, B:102:0x0a4c, B:105:0x0a57, B:113:0x0967, B:115:0x097e, B:116:0x098f, B:118:0x099a, B:119:0x09a9, B:121:0x09b4, B:122:0x09c3, B:124:0x09ce, B:125:0x09dd, B:127:0x09e8, B:128:0x09f8, B:129:0x09fb, B:132:0x08b3, B:134:0x08d1, B:135:0x08ee, B:136:0x0a5f, B:138:0x0a6e, B:141:0x0abf, B:142:0x0aba, B:143:0x0ac5, B:146:0x0ae3, B:148:0x0b1d, B:149:0x0b41, B:152:0x0b4a, B:153:0x0b8b, B:155:0x0bae, B:160:0x0bff, B:162:0x0c0d, B:163:0x0c20, B:164:0x0bef, B:166:0x0b6e, B:168:0x0c23, B:170:0x0c29, B:172:0x0c2f, B:175:0x0c40, B:178:0x0c46, B:180:0x0c54, B:238:0x06b0, B:239:0x06bb, B:244:0x06bc, B:246:0x06d0, B:249:0x06ee, B:251:0x071f, B:254:0x073c, B:257:0x0758, B:259:0x0772, B:262:0x079f, B:264:0x07bb, B:268:0x07c8, B:270:0x07d8, B:271:0x07f6, B:273:0x07fc, B:274:0x080e, B:276:0x0816, B:277:0x0829, B:278:0x07cc), top: B:7:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05f4 A[Catch: all -> 0x06ab, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0573 A[Catch: all -> 0x06ab, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x052a A[Catch: all -> 0x06ab, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x044b A[Catch: all -> 0x06ab, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0164 A[Catch: all -> 0x06ad, TryCatch #6 {all -> 0x06ad, blocks: (B:12:0x012c, B:14:0x014a, B:18:0x0154, B:20:0x0164, B:21:0x0178, B:24:0x01aa, B:240:0x016a), top: B:11:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x016a A[Catch: all -> 0x06ad, TryCatch #6 {all -> 0x06ad, blocks: (B:12:0x012c, B:14:0x014a, B:18:0x0154, B:20:0x0164, B:21:0x0178, B:24:0x01aa, B:240:0x016a), top: B:11:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06bc A[Catch: all -> 0x0c68, TryCatch #3 {all -> 0x0c68, blocks: (B:75:0x0694, B:77:0x0843, B:81:0x084e, B:84:0x0859, B:86:0x08a7, B:87:0x08fc, B:90:0x0906, B:91:0x0927, B:93:0x0959, B:94:0x0a11, B:96:0x0a23, B:98:0x0a2a, B:102:0x0a4c, B:105:0x0a57, B:113:0x0967, B:115:0x097e, B:116:0x098f, B:118:0x099a, B:119:0x09a9, B:121:0x09b4, B:122:0x09c3, B:124:0x09ce, B:125:0x09dd, B:127:0x09e8, B:128:0x09f8, B:129:0x09fb, B:132:0x08b3, B:134:0x08d1, B:135:0x08ee, B:136:0x0a5f, B:138:0x0a6e, B:141:0x0abf, B:142:0x0aba, B:143:0x0ac5, B:146:0x0ae3, B:148:0x0b1d, B:149:0x0b41, B:152:0x0b4a, B:153:0x0b8b, B:155:0x0bae, B:160:0x0bff, B:162:0x0c0d, B:163:0x0c20, B:164:0x0bef, B:166:0x0b6e, B:168:0x0c23, B:170:0x0c29, B:172:0x0c2f, B:175:0x0c40, B:178:0x0c46, B:180:0x0c54, B:238:0x06b0, B:239:0x06bb, B:244:0x06bc, B:246:0x06d0, B:249:0x06ee, B:251:0x071f, B:254:0x073c, B:257:0x0758, B:259:0x0772, B:262:0x079f, B:264:0x07bb, B:268:0x07c8, B:270:0x07d8, B:271:0x07f6, B:273:0x07fc, B:274:0x080e, B:276:0x0816, B:277:0x0829, B:278:0x07cc), top: B:7:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01aa A[Catch: all -> 0x06ad, TRY_LEAVE, TryCatch #6 {all -> 0x06ad, blocks: (B:12:0x012c, B:14:0x014a, B:18:0x0154, B:20:0x0164, B:21:0x0178, B:24:0x01aa, B:240:0x016a), top: B:11:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0435 A[Catch: all -> 0x06ab, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04a6 A[Catch: all -> 0x06ab, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04ef A[Catch: all -> 0x06ab, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0523 A[Catch: all -> 0x06ab, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x054b A[Catch: all -> 0x06ab, TRY_ENTER, TryCatch #5 {all -> 0x06ab, blocks: (B:26:0x01b0, B:28:0x01d0, B:30:0x01d6, B:32:0x01dc, B:34:0x0224, B:35:0x0267, B:37:0x026d, B:39:0x0280, B:50:0x03d7, B:51:0x0426, B:53:0x0435, B:55:0x0443, B:56:0x049b, B:58:0x04a6, B:60:0x04ce, B:61:0x04e4, B:63:0x04ef, B:64:0x04f6, B:66:0x0523, B:68:0x0539, B:71:0x054b, B:182:0x05f4, B:184:0x063c, B:185:0x0573, B:187:0x057c, B:189:0x05b9, B:190:0x05df, B:191:0x052a, B:192:0x044b, B:194:0x0452, B:196:0x0475, B:198:0x047e, B:199:0x0486, B:201:0x0494, B:229:0x0414, B:230:0x041f, B:235:0x06a3, B:236:0x06aa, B:41:0x028d, B:43:0x02ab, B:44:0x037d, B:45:0x0385, B:47:0x038b, B:49:0x03cf, B:204:0x02b9, B:205:0x02c9, B:206:0x02d1, B:208:0x02d7, B:210:0x030a, B:213:0x0317, B:220:0x0322, B:226:0x0375), top: B:22:0x01a8, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x084a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0859 A[Catch: all -> 0x0c68, TRY_ENTER, TryCatch #3 {all -> 0x0c68, blocks: (B:75:0x0694, B:77:0x0843, B:81:0x084e, B:84:0x0859, B:86:0x08a7, B:87:0x08fc, B:90:0x0906, B:91:0x0927, B:93:0x0959, B:94:0x0a11, B:96:0x0a23, B:98:0x0a2a, B:102:0x0a4c, B:105:0x0a57, B:113:0x0967, B:115:0x097e, B:116:0x098f, B:118:0x099a, B:119:0x09a9, B:121:0x09b4, B:122:0x09c3, B:124:0x09ce, B:125:0x09dd, B:127:0x09e8, B:128:0x09f8, B:129:0x09fb, B:132:0x08b3, B:134:0x08d1, B:135:0x08ee, B:136:0x0a5f, B:138:0x0a6e, B:141:0x0abf, B:142:0x0aba, B:143:0x0ac5, B:146:0x0ae3, B:148:0x0b1d, B:149:0x0b41, B:152:0x0b4a, B:153:0x0b8b, B:155:0x0bae, B:160:0x0bff, B:162:0x0c0d, B:163:0x0c20, B:164:0x0bef, B:166:0x0b6e, B:168:0x0c23, B:170:0x0c29, B:172:0x0c2f, B:175:0x0c40, B:178:0x0c46, B:180:0x0c54, B:238:0x06b0, B:239:0x06bb, B:244:0x06bc, B:246:0x06d0, B:249:0x06ee, B:251:0x071f, B:254:0x073c, B:257:0x0758, B:259:0x0772, B:262:0x079f, B:264:0x07bb, B:268:0x07c8, B:270:0x07d8, B:271:0x07f6, B:273:0x07fc, B:274:0x080e, B:276:0x0816, B:277:0x0829, B:278:0x07cc), top: B:7:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b4 A[Catch: all -> 0x0c6a, TRY_LEAVE, TryCatch #4 {all -> 0x0c6a, blocks: (B:3:0x0010, B:6:0x00ab, B:9:0x00b4, B:291:0x003c, B:294:0x0044, B:296:0x0067), top: B:2:0x0010 }] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v39, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ckju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.crme c(final defpackage.ckjz r32) {
        /*
            Method dump skipped, instructions count: 3191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckjh.c(ckjz):crme");
    }

    @Override // defpackage.ckju
    public final elfl d(final ckjz ckjzVar) {
        return elfo.g(new Callable() { // from class: ckhz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ckjh.this.a(ckjzVar);
            }
        }, this.f);
    }
}
