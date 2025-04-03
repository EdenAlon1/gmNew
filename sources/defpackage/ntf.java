package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ntf {
    public final Context a;
    public final npq b;
    public final boolean c;
    public final npl d;
    public final ntb e;
    public final lua f;
    public final List g;
    public final Object h;
    public final nta i;
    public final List j;
    public final nrx k;
    public final ltq l;
    public final Object m;
    public final Object n;
    public final nrz o;
    public boolean p;
    public long q;
    public int r;
    public RuntimeException s;
    public int t;
    public int u;
    public volatile boolean v;
    private final lua w;
    private final HandlerThread x;

    /* JADX WARN: Multi-variable type inference failed */
    public ntf(Context context, npq npqVar, nsl nslVar, npb npbVar, nps npsVar, lsg lsgVar, npn npnVar, nrx nrxVar, ntb ntbVar, nrj nrjVar, lua luaVar, lpr lprVar, ltn ltnVar) {
        npq npqVar2 = npqVar;
        this.a = context;
        this.b = npqVar2;
        this.d = new npl(npnVar);
        this.e = ntbVar;
        this.w = luaVar;
        this.k = nrxVar;
        Log.i("TransformerInternal", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-beta01] [" + lvf.b + "]");
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        this.x = handlerThread;
        handlerThread.start();
        this.g = new ArrayList();
        Looper looper = handlerThread.getLooper();
        this.h = new Object();
        this.i = new nta(npqVar2);
        int i = 0;
        while (i < npqVar2.a.size()) {
            nte nteVar = new nte(this, i, npqVar2, nslVar, npsVar, lsgVar, nrjVar, lprVar);
            int i2 = i;
            npq npqVar3 = npqVar2;
            nqn nqnVar = (nqn) npqVar3.a.get(i2);
            Looper looper2 = looper;
            this.g.add(new nsi(nqnVar, npbVar, new npa(nslVar.d, npqVar3.e), nteVar, ltnVar, looper2));
            boolean z = nqnVar.b;
            this.r++;
            i = i2 + 1;
            looper = looper2;
            npqVar2 = npqVar3;
        }
        Looper looper3 = looper;
        this.c = this.r != npqVar2.a.size();
        this.m = new Object();
        this.l = new ltq();
        this.n = new Object();
        this.o = new nrz();
        this.j = new ArrayList();
        this.f = ltnVar.b(looper3, new Handler.Callback() { // from class: nsv
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:133:0x022d  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x025e A[Catch: nru -> 0x0276, noz -> 0x0281, nrd -> 0x06dd, RuntimeException -> 0x06fa, TRY_LEAVE, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:156:0x0203 A[Catch: nru -> 0x0276, noz -> 0x0281, nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:157:0x00c5  */
            /* JADX WARN: Removed duplicated region for block: B:158:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:182:0x02f9 A[Catch: nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:190:0x031c A[Catch: nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:199:0x0339 A[Catch: nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:209:0x03c9 A[Catch: nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:212:0x03d9 A[Catch: nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:223:0x040b  */
            /* JADX WARN: Removed duplicated region for block: B:225:0x040c  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x0354  */
            /* JADX WARN: Removed duplicated region for block: B:238:0x0379  */
            /* JADX WARN: Removed duplicated region for block: B:241:0x0386 A[Catch: nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:250:0x03a1 A[Catch: nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            /* JADX WARN: Removed duplicated region for block: B:259:0x037b  */
            /* JADX WARN: Removed duplicated region for block: B:271:0x04b7 A[Catch: noz -> 0x0628, nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #4 {noz -> 0x0628, blocks: (B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7), top: B:265:0x043f }] */
            /* JADX WARN: Removed duplicated region for block: B:276:0x04c7 A[Catch: noz -> 0x0628, nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #4 {noz -> 0x0628, blocks: (B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7), top: B:265:0x043f }] */
            /* JADX WARN: Removed duplicated region for block: B:323:0x04c1  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[Catch: nru -> 0x0276, noz -> 0x0281, RuntimeException -> 0x06fa, nrd -> 0x0709, TRY_ENTER, TRY_LEAVE, TryCatch #7 {nrd -> 0x0709, blocks: (B:9:0x0012, B:17:0x001f, B:40:0x004c, B:43:0x0062, B:45:0x006e, B:54:0x009b, B:64:0x00df, B:66:0x00e3, B:67:0x00e8, B:70:0x00f4, B:71:0x00fb), top: B:8:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00df A[Catch: nru -> 0x0276, noz -> 0x0281, RuntimeException -> 0x06fa, nrd -> 0x0709, TRY_ENTER, TRY_LEAVE, TryCatch #7 {nrd -> 0x0709, blocks: (B:9:0x0012, B:17:0x001f, B:40:0x004c, B:43:0x0062, B:45:0x006e, B:54:0x009b, B:64:0x00df, B:66:0x00e3, B:67:0x00e8, B:70:0x00f4, B:71:0x00fb), top: B:8:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:74:0x010f A[Catch: nru -> 0x0276, noz -> 0x0281, nrd -> 0x06dd, RuntimeException -> 0x06fa, TryCatch #9 {nrd -> 0x06dd, blocks: (B:20:0x002a, B:22:0x0032, B:24:0x003e, B:27:0x0633, B:29:0x0639, B:34:0x0649, B:38:0x0048, B:41:0x0058, B:47:0x007b, B:52:0x008c, B:56:0x00af, B:59:0x00b6, B:62:0x00c6, B:72:0x00fc, B:74:0x010f, B:76:0x0124, B:78:0x012a, B:80:0x0135, B:81:0x01d9, B:82:0x0147, B:85:0x0158, B:127:0x01de, B:128:0x0212, B:130:0x0217, B:131:0x021f, B:134:0x022e, B:136:0x0236, B:138:0x0246, B:140:0x0253, B:143:0x0256, B:145:0x025e, B:147:0x0262, B:150:0x0266, B:151:0x0275, B:154:0x01ea, B:155:0x0202, B:156:0x0203, B:164:0x0277, B:165:0x0280, B:161:0x0282, B:162:0x028b, B:166:0x028c, B:168:0x0294, B:170:0x029c, B:172:0x02a4, B:174:0x02d3, B:176:0x02db, B:179:0x02e2, B:180:0x02f4, B:182:0x02f9, B:188:0x0312, B:190:0x031c, B:194:0x032f, B:197:0x0334, B:199:0x0339, B:205:0x034d, B:207:0x03b8, B:209:0x03c9, B:210:0x03cc, B:212:0x03d9, B:221:0x03fb, B:224:0x040d, B:230:0x0357, B:236:0x036e, B:239:0x037c, B:241:0x0386, B:245:0x0397, B:248:0x039c, B:250:0x03a1, B:255:0x03b2, B:263:0x0432, B:266:0x043f, B:269:0x04b2, B:271:0x04b7, B:273:0x04bd, B:276:0x04c7, B:280:0x04ce, B:282:0x04d6, B:285:0x04df, B:288:0x04ec, B:289:0x04ee, B:291:0x0513, B:292:0x051f, B:294:0x0544, B:298:0x054e, B:299:0x055b, B:300:0x0561, B:302:0x0580, B:303:0x0592, B:309:0x05ce, B:311:0x05f9, B:312:0x0600, B:313:0x0602, B:317:0x0607, B:318:0x0627, B:322:0x051a, B:326:0x0465, B:329:0x0470, B:331:0x0482, B:334:0x0496, B:336:0x049a, B:337:0x04a7, B:341:0x0629, B:342:0x0632, B:344:0x0654, B:347:0x06a8, B:349:0x06ae, B:353:0x065c, B:355:0x0664, B:359:0x0686, B:360:0x0688, B:368:0x0692, B:357:0x0693, B:370:0x069e, B:371:0x06a0, B:379:0x06c2, B:380:0x06c3, B:382:0x06d0, B:386:0x06e1, B:388:0x06e9), top: B:10:0x0015 }] */
            @Override // android.os.Handler.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean handleMessage(android.os.Message r30) {
                /*
                    Method dump skipped, instructions count: 1809
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.nsv.handleMessage(android.os.Message):boolean");
            }
        });
    }

    public final void a(int i, nrd nrdVar) {
        nrd nrdVar2;
        char c;
        final engr engrVar = new engr();
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            nsi nsiVar = (nsi) this.g.get(i2);
            nsiVar.j();
            engrVar.j(nsiVar.f.g());
        }
        boolean z = this.v;
        final nrd nrdVar3 = null;
        if (!this.v) {
            this.v = true;
            Log.i("TransformerInternal", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0-beta01] [" + lvf.b + "] [" + lqx.a() + "]");
            for (int i3 = 0; i3 < this.j.size(); i3++) {
                try {
                    ((nsc) this.j.get(i3)).d();
                } catch (RuntimeException e) {
                    if (nrdVar3 == null) {
                        nrdVar3 = new nrd("Unexpected runtime error", e, 1001);
                        this.s = e;
                    }
                }
            }
            for (int i4 = 0; i4 < this.g.size(); i4++) {
                try {
                    ((nsi) this.g.get(i4)).g();
                } catch (RuntimeException e2) {
                    if (nrdVar3 == null) {
                        nrdVar3 = new nrd("Unexpected runtime error", e2, 1001);
                        this.s = e2;
                    }
                }
            }
            try {
                try {
                    nrx nrxVar = this.k;
                    if (i == 0) {
                        c = 0;
                    } else if (i == 1) {
                        c = 1;
                    } else {
                        c = 2;
                        if (i != 2) {
                            throw new IllegalStateException(a.h(i, "Unexpected end reason "));
                        }
                    }
                    nrxVar.g = false;
                    nrt nrtVar = nrxVar.m;
                    if (nrtVar != null) {
                        try {
                            nrt nrtVar2 = ((nqk) nrtVar).a;
                            if (!((nrk) nrtVar2).g) {
                                if (!((nrk) nrtVar2).f) {
                                    ((nrk) nrtVar2).a();
                                }
                                try {
                                    ((nrk) nrtVar2).f = false;
                                    try {
                                        MediaMuxer mediaMuxer = ((nrk) nrtVar2).c;
                                        try {
                                            mediaMuxer.stop();
                                        } catch (RuntimeException e3) {
                                            if (lvf.a < 30) {
                                                try {
                                                    Field declaredField = MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                                                    declaredField.setAccessible(true);
                                                    Integer num = (Integer) declaredField.get(mediaMuxer);
                                                    num.intValue();
                                                    Field declaredField2 = MediaMuxer.class.getDeclaredField("mState");
                                                    declaredField2.setAccessible(true);
                                                    declaredField2.set(mediaMuxer, num);
                                                } catch (Exception unused) {
                                                }
                                            }
                                            throw e3;
                                        }
                                    } catch (RuntimeException e4) {
                                        throw new noz("Failed to stop the MediaMuxer", e4);
                                    }
                                } finally {
                                    ((nrk) nrtVar2).c.release();
                                    ((nrk) nrtVar2).g = true;
                                }
                            }
                        } catch (noz e5) {
                            if (c == 1) {
                                String message = e5.getMessage();
                                lti.f(message);
                                if (message.equals("Failed to stop the MediaMuxer")) {
                                }
                            }
                            throw e5;
                        }
                    }
                } catch (noz e6) {
                    if (nrdVar3 == null) {
                        nrdVar2 = new nrd("Muxer error", e6, 7001);
                        nrdVar3 = nrdVar2;
                    }
                }
            } catch (RuntimeException e7) {
                if (nrdVar3 == null) {
                    nrdVar2 = new nrd("Unexpected runtime error", e7, 1001);
                    this.s = e7;
                    nrdVar3 = nrdVar2;
                }
            }
            lua luaVar = this.f;
            final HandlerThread handlerThread = this.x;
            handlerThread.getClass();
            luaVar.b(new Runnable() { // from class: nsw
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            });
        }
        if (i == 1) {
            this.l.d();
            return;
        }
        if (nrdVar != null) {
            nrdVar3 = nrdVar;
        }
        if (nrdVar3 == null) {
            if (z) {
                return;
            }
            lti.c(this.w.b(new Runnable() { // from class: nsy
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2;
                    ntf ntfVar = ntf.this;
                    npl nplVar = ntfVar.d;
                    engw g = engrVar.g();
                    String str = nplVar.b;
                    String str2 = nplVar.c;
                    nss nssVar = (nss) ntfVar.e;
                    nssVar.a.f.c(g);
                    if (str != null) {
                        nssVar.a.f.f = str;
                    }
                    if (str2 != null) {
                        nssVar.a.f.m = str2;
                    }
                    nssVar.a.g = null;
                    nsu nsuVar = nssVar.a;
                    int i5 = nsuVar.j;
                    boolean z3 = true;
                    if (i5 != 1) {
                        if (i5 == 2) {
                            nsuVar.j = 3;
                            long j = nrx.a;
                            throw null;
                        }
                        if (i5 == 3) {
                            nsuVar.j = 4;
                            throw null;
                        }
                        if (i5 == 5) {
                            nsuVar.j = 6;
                            npq npqVar = nsuVar.h;
                            lti.f(npqVar);
                            throw null;
                        }
                        if (i5 != 6) {
                            nsuVar.b();
                            return;
                        } else {
                            nsuVar.f.o = 1;
                            nsuVar.b();
                            return;
                        }
                    }
                    nsuVar.j = 2;
                    npq npqVar2 = nsuVar.h;
                    lti.f(npqVar2);
                    npp nppVar = new npp(npqVar2);
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        engw engwVar = npqVar2.a;
                        if (i6 >= engwVar.size()) {
                            lti.b(!arrayList.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
                            nppVar.a = engw.n(arrayList);
                            nppVar.a();
                            throw null;
                        }
                        nqn nqnVar = (nqn) engwVar.get(i6);
                        engw engwVar2 = nqnVar.a;
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = 0;
                        while (i7 < ((enou) engwVar2).c) {
                            nql nqlVar = (nql) engwVar2.get(i7);
                            lqw lqwVar = nqlVar.a;
                            long j2 = nqlVar.e;
                            nqo nqoVar = nqlVar.g;
                            if (i7 == 0) {
                                lqn lqnVar = lqwVar.e;
                                lqm lqmVar = new lqm(lqnVar);
                                z2 = z3;
                                long u = lvf.u(lqnVar.b + lvf.z(0L));
                                lti.a(u >= 0 ? z2 : false);
                                lqmVar.a = u;
                                lqn lqnVar2 = new lqn(lqmVar);
                                lql lqlVar = new lql(nqlVar.a);
                                lqlVar.b = new lqm(lqnVar2);
                                lqwVar = lqlVar.a();
                                i7 = 0;
                            } else {
                                z2 = z3;
                            }
                            arrayList2.add(new nql(lqwVar, true, j2, nqoVar));
                            i7++;
                            z3 = z2;
                        }
                        nqm nqmVar = new nqm(arrayList2);
                        boolean z4 = nqnVar.b;
                        arrayList.add(new nqn(nqmVar));
                        i6++;
                    }
                }
            }));
        } else if (z) {
            Log.w("TransformerInternal", "Export error after export ended", nrdVar3);
        } else {
            lti.c(this.w.b(new Runnable() { // from class: nsx
                @Override // java.lang.Runnable
                public final void run() {
                    final nrd nrdVar4 = nrdVar3;
                    int i5 = nrdVar4.b;
                    ntf ntfVar = ntf.this;
                    ntb ntbVar = ntfVar.e;
                    engw g = engrVar.g();
                    npl nplVar = ntfVar.d;
                    String str = nplVar.b;
                    String str2 = nplVar.c;
                    if (i5 == 7003) {
                        nss nssVar = (nss) ntbVar;
                        nsu nsuVar = nssVar.a;
                        if (nsuVar.e() || nsuVar.d()) {
                            nsuVar.g = null;
                            nssVar.a.f.b();
                            nsu nsuVar2 = nssVar.a;
                            nsuVar2.f.o = 6;
                            nsuVar2.j = 0;
                            npq npqVar = nsuVar2.h;
                            lti.f(npqVar);
                            String str3 = nsuVar2.i;
                            lti.f(str3);
                            nsuVar2.h(npqVar, new nrx(str3, nsuVar2.d, nsuVar2.e), nsuVar2.e);
                            return;
                        }
                    }
                    nss nssVar2 = (nss) ntbVar;
                    nssVar2.a.f.c(g);
                    if (str != null) {
                        nssVar2.a.f.f = str;
                    }
                    if (str2 != null) {
                        nssVar2.a.f.m = str2;
                    }
                    final nsu nsuVar3 = nssVar2.a;
                    nsuVar3.f.p = nrdVar4;
                    nsuVar3.a();
                    nsuVar3.f.a();
                    nsuVar3.c.d(-1, new lud() { // from class: nsm
                        @Override // defpackage.lud
                        public final void a(Object obj) {
                            npq npqVar2 = nsu.this.h;
                            lti.f(npqVar2);
                            ((nst) obj).b(npqVar2, nrdVar4);
                        }
                    });
                    nsuVar3.c.c();
                    int i6 = lvf.a;
                    nsuVar3.j = 0;
                    nssVar2.a.g = null;
                }
            }));
        }
    }

    public final void b(nrd nrdVar) {
        c();
        this.f.g(2, nrdVar).b();
    }

    public final void c() {
        lti.d(this.x.isAlive(), "Internal thread is dead.");
    }
}
