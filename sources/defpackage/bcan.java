package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcan extends dtsr implements bbzi {
    @Deprecated
    public bcan(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bcav bcavVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bcba.a, dtyoVar, dtvsVar, bcavVar);
    }

    public final String A() {
        return getString(cM(21, bcba.a));
    }

    public final String B() {
        return getString(cM(9, bcba.a));
    }

    public final String C() {
        return getString(cM(8, bcba.a));
    }

    public final String D() {
        return getString(cM(20, bcba.a));
    }

    public final boolean E() {
        return getInt(cM(23, bcba.a)) == 1;
    }

    public final boolean F() {
        return getInt(cM(5, bcba.a)) == 1;
    }

    public final boolean G() {
        return getInt(cM(4, bcba.a)) == 1;
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bbwr();
    }

    public final int c() {
        return getInt(cM(15, bcba.a));
    }

    public final int e() {
        return getInt(cM(3, bcba.a));
    }

    public final int f() {
        return getInt(cM(14, bcba.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        Optional[] optionalArr;
        azsu[] azsuVarArr;
        long[] jArr;
        HashSet hashSet;
        ConversationIdType[] conversationIdTypeArr;
        int[] iArr;
        String[] strArr;
        String[] strArr2;
        long[] jArr2;
        long[] jArr3;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        int[] iArr8;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        String[] strArr11;
        String[] strArr12;
        String[] strArr13;
        boolean[] zArr;
        bdhg[] bdhgVarArr;
        bdhg[] bdhgVarArr2;
        ConversationIdType[] conversationIdTypeArr2;
        fayv[] fayvVarArr;
        String[] strArr14;
        fayv[] fayvVarArr2;
        boolean z;
        csgg[] csggVarArr;
        String[] strArr15;
        csgg[] csggVarArr2;
        long[] jArr4;
        int i;
        csgg[] csggVarArr3;
        Iterator it;
        fayv fayvVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z2 = dtvsVar.b;
                if (!di) {
                    messageIdTypeArr = null;
                } else if (z2) {
                    long[] ds = ds(getString(cM(0, bcba.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        messageIdTypeArr2[i3] = new MessageIdType(ds[i3]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{p()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bbzj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bcan.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    optionalArr = null;
                } else if (z2) {
                    String[] dt = dt(getString(cM(1, bcba.a)));
                    int length3 = dt.length;
                    Optional[] optionalArr2 = new Optional[length3];
                    for (int i4 = 0; i4 < length3; i4++) {
                        optionalArr2[i4] = bdhj.a(dt[i4]);
                    }
                    optionalArr = (Optional[]) dtub.C(null, optionalArr2, new Optional[0]);
                } else {
                    optionalArr = new Optional[]{t()};
                }
                dtsr.dz(length, optionalArr, new emyl() { // from class: bbzl
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_persistence_id:".concat(String.valueOf(bcan.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    azsuVarArr = null;
                } else if (z2) {
                    String[] dt2 = dt(getString(cM(2, bcba.a)));
                    int length4 = dt2.length;
                    azsu[] azsuVarArr2 = new azsu[length4];
                    for (int i5 = 0; i5 < length4; i5++) {
                        azsuVarArr2[i5] = azsv.a(dt2[i5]);
                    }
                    azsuVarArr = (azsu[]) dtub.C(null, azsuVarArr2, new azsu[0]);
                } else {
                    azsuVarArr = new azsu[]{n()};
                }
                dtsr.dz(length, azsuVarArr, new emyl() { // from class: bbzx
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "my_identity:".concat(String.valueOf(bcan.this.getString(2)));
                    }
                });
                int[] z3 = di(3) ? z2 ? dtub.z(null, dr(getString(cM(3, bcba.a)))) : new int[]{e()} : null;
                dtsr.dx(length, z3, new emyl() { // from class: bbzy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_status:".concat(String.valueOf(bcan.this.getString(3)));
                    }
                });
                boolean[] D = di(4) ? z2 ? dtub.D(null, du(getString(cM(4, bcba.a)))) : new boolean[]{G()} : null;
                dtsr.dA(length, D, new emyl() { // from class: bbzz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "seen:".concat(String.valueOf(bcan.this.getString(4)));
                    }
                });
                boolean[] D2 = di(5) ? z2 ? dtub.D(null, du(getString(cM(5, bcba.a)))) : new boolean[]{F()} : null;
                dtsr.dA(length, D2, new emyl() { // from class: bcaa
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "read:".concat(String.valueOf(bcan.this.getString(5)));
                    }
                });
                if (!di(6)) {
                    jArr = dB;
                    hashSet = hashSet2;
                    conversationIdTypeArr = null;
                } else if (z2) {
                    long[] ds2 = ds(getString(cM(6, bcba.a)));
                    int length5 = ds2.length;
                    ConversationIdType[] conversationIdTypeArr3 = new ConversationIdType[length5];
                    int i6 = 0;
                    while (i6 < length5) {
                        conversationIdTypeArr3[i6] = new ConversationIdType(ds2[i6]);
                        i6++;
                        hashSet2 = hashSet2;
                        dB = dB;
                        i2 = 0;
                    }
                    jArr = dB;
                    hashSet = hashSet2;
                    conversationIdTypeArr = (ConversationIdType[]) dtub.C(null, conversationIdTypeArr3, new ConversationIdType[i2]);
                } else {
                    jArr = dB;
                    hashSet = hashSet2;
                    conversationIdTypeArr = new ConversationIdType[]{o()};
                }
                dtsr.dz(length, conversationIdTypeArr, new emyl() { // from class: bcab
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "conversation_id:".concat(String.valueOf(bcan.this.getString(6)));
                    }
                });
                int[] z4 = di(7) ? z2 ? dtub.z(null, dr(getString(cM(7, bcba.a)))) : new int[]{i()} : null;
                dtsr.dx(length, z4, new emyl() { // from class: bcac
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sender_participant_id:".concat(String.valueOf(bcan.this.getString(7)));
                    }
                });
                String[] strArr16 = di(8) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(8, bcba.a))), new String[0]) : new String[]{C()} : null;
                dtsr.dz(length, strArr16, new emyl() { // from class: bcad
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sender_send_destination:".concat(String.valueOf(bcan.this.getString(8)));
                    }
                });
                String[] strArr17 = di(9) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(9, bcba.a))), new String[0]) : new String[]{B()} : null;
                dtsr.dz(length, strArr17, new emyl() { // from class: bcae
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "msisdn_receiving_rcs_message:".concat(String.valueOf(bcan.this.getString(9)));
                    }
                });
                int[] z5 = di(10) ? z2 ? dtub.z(null, dr(getString(cM(10, bcba.a)))) : new int[]{h()} : null;
                dtsr.dx(length, z5, new emyl() { // from class: bbzu
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "self_participant_id:".concat(String.valueOf(bcan.this.getString(10)));
                    }
                });
                if (!di(11)) {
                    iArr = z4;
                    strArr = null;
                } else if (z2) {
                    iArr = z4;
                    strArr = (String[]) dtub.C(null, dt(getString(cM(11, bcba.a))), new String[0]);
                } else {
                    iArr = z4;
                    strArr = new String[]{z()};
                }
                dtsr.dz(length, strArr, new emyl() { // from class: bcaf
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "mms_subject:".concat(String.valueOf(bcan.this.getString(11)));
                    }
                });
                long[] B = di(12) ? z2 ? dtub.B(null, ds(getString(cM(12, bcba.a)))) : new long[]{l()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bcag
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "received_timestamp:".concat(String.valueOf(bcan.this.getString(12)));
                    }
                });
                if (!di(13)) {
                    strArr2 = strArr;
                    jArr2 = null;
                } else if (z2) {
                    strArr2 = strArr;
                    jArr2 = dtub.B(null, ds(getString(cM(13, bcba.a))));
                } else {
                    strArr2 = strArr;
                    jArr2 = new long[]{m()};
                }
                dtsr.dy(length, jArr2, new emyl() { // from class: bcah
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sent_timestamp:".concat(String.valueOf(bcan.this.getString(13)));
                    }
                });
                if (!di(14)) {
                    jArr3 = jArr2;
                    iArr2 = null;
                } else if (z2) {
                    jArr3 = jArr2;
                    iArr2 = dtub.z(null, dr(getString(cM(14, bcba.a))));
                } else {
                    jArr3 = jArr2;
                    iArr2 = new int[]{f()};
                }
                dtsr.dx(length, iArr2, new emyl() { // from class: bcai
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "protocol:".concat(String.valueOf(bcan.this.getString(14)));
                    }
                });
                if (!di(15)) {
                    iArr3 = iArr2;
                    iArr4 = null;
                } else if (z2) {
                    iArr3 = iArr2;
                    iArr4 = dtub.z(null, dr(getString(cM(15, bcba.a))));
                } else {
                    iArr3 = iArr2;
                    iArr4 = new int[]{c()};
                }
                dtsr.dx(length, iArr4, new emyl() { // from class: bcaj
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_priority:".concat(String.valueOf(bcan.this.getString(15)));
                    }
                });
                if (!di(16)) {
                    iArr5 = iArr4;
                    iArr6 = null;
                } else if (z2) {
                    iArr5 = iArr4;
                    iArr6 = dtub.z(null, dr(getString(cM(16, bcba.a))));
                } else {
                    iArr5 = iArr4;
                    iArr6 = new int[]{g()};
                }
                dtsr.dx(length, iArr6, new emyl() { // from class: bcak
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_encryption_status:".concat(String.valueOf(bcan.this.getString(16)));
                    }
                });
                if (!di(17)) {
                    iArr7 = iArr6;
                    strArr3 = strArr17;
                    strArr4 = null;
                } else if (z2) {
                    iArr7 = iArr6;
                    strArr3 = strArr17;
                    strArr4 = (String[]) dtub.C(null, dt(getString(cM(17, bcba.a))), new String[0]);
                } else {
                    iArr7 = iArr6;
                    strArr3 = strArr17;
                    strArr4 = new String[]{u()};
                }
                dtsr.dz(length, strArr4, new emyl() { // from class: bcal
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cloud_sync_id:".concat(String.valueOf(bcan.this.getString(17)));
                    }
                });
                if (!di(18)) {
                    strArr5 = strArr4;
                    strArr6 = null;
                } else if (z2) {
                    strArr5 = strArr4;
                    strArr6 = (String[]) dtub.C(null, dt(getString(cM(18, bcba.a))), new String[0]);
                } else {
                    strArr5 = strArr4;
                    strArr6 = new String[]{x()};
                }
                dtsr.dz(length, strArr6, new emyl() { // from class: bcam
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "correlation_id:".concat(String.valueOf(bcan.this.getString(18)));
                    }
                });
                int[] z6 = di(19) ? z2 ? dtub.z(null, dr(getString(cM(19, bcba.a)))) : new int[]{j()} : null;
                dtsr.dx(length, z6, new emyl() { // from class: bbzk
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sms_error_code:".concat(String.valueOf(bcan.this.getString(19)));
                    }
                });
                if (!di(20)) {
                    strArr7 = strArr6;
                    iArr8 = z6;
                    strArr8 = null;
                } else if (z2) {
                    strArr7 = strArr6;
                    iArr8 = z6;
                    strArr8 = (String[]) dtub.C(null, dt(getString(cM(20, bcba.a))), new String[0]);
                } else {
                    strArr7 = strArr6;
                    iArr8 = z6;
                    strArr8 = new String[]{D()};
                }
                dtsr.dz(length, strArr8, new emyl() { // from class: bbzm
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "sms_error_desc_map_name:".concat(String.valueOf(bcan.this.getString(20)));
                    }
                });
                if (!di(21)) {
                    strArr9 = strArr8;
                    strArr10 = null;
                } else if (z2) {
                    strArr9 = strArr8;
                    strArr10 = (String[]) dtub.C(null, dt(getString(cM(21, bcba.a))), new String[0]);
                } else {
                    strArr9 = strArr8;
                    strArr10 = new String[]{A()};
                }
                dtsr.dz(length, strArr10, new emyl() { // from class: bbzn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "mms_transaction_id:".concat(String.valueOf(bcan.this.getString(21)));
                    }
                });
                if (!di(22)) {
                    strArr11 = strArr10;
                    strArr12 = null;
                } else if (z2) {
                    strArr11 = strArr10;
                    strArr12 = (String[]) dtub.C(null, dt(getString(cM(22, bcba.a))), new String[0]);
                } else {
                    strArr11 = strArr10;
                    strArr12 = new String[]{y()};
                }
                dtsr.dz(length, strArr12, new emyl() { // from class: bbzo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "mms_content_location:".concat(String.valueOf(bcan.this.getString(22)));
                    }
                });
                boolean[] D3 = di(23) ? z2 ? dtub.D(null, du(getString(cM(23, bcba.a)))) : new boolean[]{E()} : null;
                dtsr.dA(length, D3, new emyl() { // from class: bbzp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "is_hidden:".concat(String.valueOf(bcan.this.getString(23)));
                    }
                });
                if (!di(24)) {
                    strArr13 = strArr12;
                    zArr = D3;
                    bdhgVarArr = null;
                } else if (z2) {
                    strArr13 = strArr12;
                    String[] dt3 = dt(getString(cM(24, bcba.a)));
                    int length6 = dt3.length;
                    bdhg[] bdhgVarArr3 = new bdhg[length6];
                    zArr = D3;
                    for (int i7 = 0; i7 < length6; i7++) {
                        bdhgVarArr3[i7] = bdhg.a(dt3[i7]);
                    }
                    bdhgVarArr = (bdhg[]) dtub.C(null, bdhgVarArr3, new bdhg[0]);
                } else {
                    strArr13 = strArr12;
                    zArr = D3;
                    bdhgVarArr = new bdhg[]{q()};
                }
                dtsr.dz(length, bdhgVarArr, new emyl() { // from class: bbzq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "rcs_message_id:".concat(String.valueOf(bcan.this.getString(24)));
                    }
                });
                if (!di(25)) {
                    bdhgVarArr2 = bdhgVarArr;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    fayvVarArr = null;
                } else if (z2) {
                    List de = de(getString(cM(25, bcba.a)));
                    fayv[] fayvVarArr3 = new fayv[de.size()];
                    Iterator it2 = de.iterator();
                    int i8 = 0;
                    while (it2.hasNext()) {
                        bdhg[] bdhgVarArr4 = bdhgVarArr;
                        try {
                            byte[] y = dtub.y((String) it2.next());
                            int i9 = i8 + 1;
                            if (y == null) {
                                it = it2;
                                fayvVar = null;
                            } else {
                                it = it2;
                                try {
                                    fayvVar = (fayv) eyfy.parseFrom(fayv.a, y);
                                } catch (Throwable unused) {
                                    i8 = i9;
                                    fayvVarArr3[i8] = null;
                                    i8++;
                                    bdhgVarArr = bdhgVarArr4;
                                    it2 = it;
                                }
                            }
                            fayvVarArr3[i8] = fayvVar;
                            i8 = i9;
                        } catch (Throwable unused2) {
                            it = it2;
                        }
                        bdhgVarArr = bdhgVarArr4;
                        it2 = it;
                    }
                    bdhgVarArr2 = bdhgVarArr;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    fayvVarArr = (fayv[]) dtub.C(null, fayvVarArr3, new fayv[0]);
                } else {
                    bdhgVarArr2 = bdhgVarArr;
                    conversationIdTypeArr2 = conversationIdTypeArr;
                    fayvVarArr = new fayv[]{s()};
                }
                dtsr.dz(length, fayvVarArr, new emyl() { // from class: bbzr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "custom_headers:".concat(String.valueOf(bcan.this.getString(25)));
                    }
                });
                String[] strArr18 = di(26) ? z2 ? (String[]) dtub.C(null, dt(getString(cM(26, bcba.a))), new String[0]) : new String[]{w()} : null;
                dtsr.dz(length, strArr18, new emyl() { // from class: bbzs
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_id:".concat(String.valueOf(bcan.this.getString(26)));
                    }
                });
                if (di(27)) {
                    if (z2) {
                        int[] dr = dr(getString(cM(27, bcba.a)));
                        csgg[] values = csgg.values();
                        strArr14 = strArr18;
                        int length7 = values.length;
                        csgg[] csggVarArr4 = new csgg[dr.length];
                        fayvVarArr2 = fayvVarArr;
                        z = z2;
                        for (int i10 = 0; i10 < dr.length; i10++) {
                            int i11 = dr[i10];
                            if (i11 >= length7) {
                                throw new IllegalStateException();
                            }
                            csggVarArr4[i10] = values[i11];
                        }
                        csggVarArr3 = (csgg[]) dtub.C(null, csggVarArr4, new csgg[0]);
                    } else {
                        strArr14 = strArr18;
                        fayvVarArr2 = fayvVarArr;
                        z = z2;
                        csggVarArr3 = new csgg[]{r()};
                    }
                    csggVarArr = csggVarArr3;
                } else {
                    strArr14 = strArr18;
                    fayvVarArr2 = fayvVarArr;
                    z = z2;
                    csggVarArr = null;
                }
                dtsr.dz(length, csggVarArr, new emyl() { // from class: bbzt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_life_cycle:".concat(String.valueOf(bcan.this.getString(27)));
                    }
                });
                String[] strArr19 = di(28) ? z ? (String[]) dtub.C(null, dt(getString(cM(28, bcba.a))), new String[0]) : new String[]{v()} : null;
                dtsr.dz(length, strArr19, new emyl() { // from class: bbzv
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_correlation_id:".concat(String.valueOf(bcan.this.getString(28)));
                    }
                });
                long[] B2 = di(29) ? z ? dtub.B(null, ds(getString(cM(29, bcba.a)))) : new long[]{k()} : null;
                dtsr.dy(length, B2, new emyl() { // from class: bbzw
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "cms_last_mod_seq:".concat(String.valueOf(bcan.this.getString(29)));
                    }
                });
                engr engrVar = new engr();
                int i12 = 0;
                while (i12 < length) {
                    long j = jArr[i12];
                    if (j > 0) {
                        strArr15 = strArr19;
                        HashSet hashSet3 = hashSet;
                        if (hashSet3.contains(Long.valueOf(j))) {
                            hashSet = hashSet3;
                        } else {
                            hashSet3.add(Long.valueOf(jArr[i12]));
                            String[] strArr20 = bcba.a;
                            bbwt bbwtVar = new bbwt();
                            bbwtVar.aF();
                            bbwtVar.aD();
                            long j2 = jArr[i12];
                            hashSet = hashSet3;
                            if (messageIdTypeArr != null) {
                                MessageIdType messageIdType = messageIdTypeArr[i12];
                                i = length;
                                bbwtVar.aE(0);
                                bbwtVar.a = messageIdType;
                            } else {
                                i = length;
                            }
                            if (optionalArr != null) {
                                Optional optional = optionalArr[i12];
                                int i13 = bbwtVar.aB;
                                jArr4 = B2;
                                if (i13 < 120) {
                                    dtub.w("message_persistence_id", i13);
                                }
                                bbwtVar.aE(1);
                                bbwtVar.b = optional;
                            } else {
                                jArr4 = B2;
                            }
                            if (azsuVarArr != null) {
                                azsu azsuVar = azsuVarArr[i12];
                                int i14 = bbwtVar.aB;
                                if (i14 < 110) {
                                    dtub.w("my_identity", i14);
                                }
                                bbwtVar.aE(2);
                                bbwtVar.c = azsuVar;
                            }
                            if (z3 != null) {
                                int i15 = z3[i12];
                                int i16 = bbwtVar.aB;
                                if (i16 < 0) {
                                    dtub.w("message_status", i16);
                                }
                                bbwtVar.aE(3);
                                bbwtVar.d = i15;
                            }
                            if (D != null) {
                                boolean z7 = D[i12];
                                int i17 = bbwtVar.aB;
                                if (i17 < 0) {
                                    dtub.w("seen", i17);
                                }
                                bbwtVar.aE(4);
                                bbwtVar.e = z7;
                            }
                            if (D2 != null) {
                                boolean z8 = D2[i12];
                                int i18 = bbwtVar.aB;
                                if (i18 < 0) {
                                    dtub.w("read", i18);
                                }
                                bbwtVar.aE(5);
                                bbwtVar.f = z8;
                            }
                            if (conversationIdTypeArr2 != null) {
                                ConversationIdType conversationIdType = conversationIdTypeArr2[i12];
                                int i19 = bbwtVar.aB;
                                if (i19 < 0) {
                                    dtub.w("conversation_id", i19);
                                }
                                bbwtVar.aE(6);
                                bbwtVar.g = conversationIdType;
                            }
                            if (iArr != null) {
                                int i20 = iArr[i12];
                                int i21 = bbwtVar.aB;
                                if (i21 < 0) {
                                    dtub.w("sender_participant_id", i21);
                                }
                                bbwtVar.aE(7);
                                bbwtVar.h = i20;
                            }
                            if (strArr16 != null) {
                                String str = strArr16[i12];
                                int i22 = bbwtVar.aB;
                                if (i22 < 80) {
                                    dtub.w("sender_send_destination", i22);
                                }
                                bbwtVar.aE(8);
                                bbwtVar.i = str;
                            }
                            if (strArr3 != null) {
                                String str2 = strArr3[i12];
                                int i23 = bbwtVar.aB;
                                if (i23 < 80) {
                                    dtub.w("msisdn_receiving_rcs_message", i23);
                                }
                                bbwtVar.aE(9);
                                bbwtVar.j = str2;
                            }
                            if (z5 != null) {
                                int i24 = z5[i12];
                                int i25 = bbwtVar.aB;
                                if (i25 < 0) {
                                    dtub.w("self_participant_id", i25);
                                }
                                bbwtVar.aE(10);
                                bbwtVar.k = i24;
                            }
                            if (strArr2 != null) {
                                String str3 = strArr2[i12];
                                int i26 = bbwtVar.aB;
                                if (i26 < 0) {
                                    dtub.w("mms_subject", i26);
                                }
                                bbwtVar.aE(11);
                                bbwtVar.l = str3;
                            }
                            if (B != null) {
                                long j3 = B[i12];
                                int i27 = bbwtVar.aB;
                                csggVarArr2 = csggVarArr;
                                if (i27 < 0) {
                                    dtub.w("received_timestamp", i27);
                                }
                                bbwtVar.aE(12);
                                bbwtVar.m = j3;
                            } else {
                                csggVarArr2 = csggVarArr;
                            }
                            if (jArr3 != null) {
                                long j4 = jArr3[i12];
                                int i28 = bbwtVar.aB;
                                if (i28 < 0) {
                                    dtub.w("sent_timestamp", i28);
                                }
                                bbwtVar.aE(13);
                                bbwtVar.n = j4;
                            }
                            if (iArr3 != null) {
                                int i29 = iArr3[i12];
                                int i30 = bbwtVar.aB;
                                if (i30 < 0) {
                                    dtub.w("protocol", i30);
                                }
                                bbwtVar.aE(14);
                                bbwtVar.o = i29;
                            }
                            if (iArr5 != null) {
                                int i31 = iArr5[i12];
                                int i32 = bbwtVar.aB;
                                if (i32 < 0) {
                                    dtub.w("message_priority", i32);
                                }
                                bbwtVar.aE(15);
                                bbwtVar.p = i31;
                            }
                            if (iArr7 != null) {
                                int i33 = iArr7[i12];
                                int i34 = bbwtVar.aB;
                                if (i34 < 0) {
                                    dtub.w("rcs_encryption_status", i34);
                                }
                                bbwtVar.aE(16);
                                bbwtVar.q = i33;
                            }
                            if (strArr5 != null) {
                                String str4 = strArr5[i12];
                                int i35 = bbwtVar.aB;
                                if (i35 < 0) {
                                    dtub.w("cloud_sync_id", i35);
                                }
                                bbwtVar.aE(17);
                                bbwtVar.r = str4;
                            }
                            if (strArr7 != null) {
                                String str5 = strArr7[i12];
                                int i36 = bbwtVar.aB;
                                if (i36 < 0) {
                                    dtub.w("correlation_id", i36);
                                }
                                bbwtVar.aE(18);
                                bbwtVar.s = str5;
                            }
                            if (iArr8 != null) {
                                int i37 = iArr8[i12];
                                int i38 = bbwtVar.aB;
                                if (i38 < 0) {
                                    dtub.w("sms_error_code", i38);
                                }
                                bbwtVar.aE(19);
                                bbwtVar.t = i37;
                            }
                            if (strArr9 != null) {
                                String str6 = strArr9[i12];
                                int i39 = bbwtVar.aB;
                                if (i39 < 0) {
                                    dtub.w("sms_error_desc_map_name", i39);
                                }
                                bbwtVar.aE(20);
                                bbwtVar.u = str6;
                            }
                            if (strArr11 != null) {
                                String str7 = strArr11[i12];
                                bbwtVar.aE(21);
                                bbwtVar.v = str7;
                            }
                            if (strArr13 != null) {
                                String str8 = strArr13[i12];
                                bbwtVar.aE(22);
                                bbwtVar.w = str8;
                            }
                            if (zArr != null) {
                                boolean z9 = zArr[i12];
                                int i40 = bbwtVar.aB;
                                if (i40 < 0) {
                                    dtub.w("is_hidden", i40);
                                }
                                bbwtVar.aE(23);
                                bbwtVar.x = z9;
                            }
                            if (bdhgVarArr2 != null) {
                                bdhg bdhgVar = bdhgVarArr2[i12];
                                int i41 = bbwtVar.aB;
                                if (i41 < 0) {
                                    dtub.w("rcs_message_id", i41);
                                }
                                bbwtVar.aE(24);
                                bbwtVar.y = bdhgVar;
                            }
                            if (fayvVarArr2 != null) {
                                fayv fayvVar2 = fayvVarArr2[i12];
                                int i42 = bbwtVar.aB;
                                if (i42 < 50) {
                                    dtub.w("custom_headers", i42);
                                }
                                bbwtVar.aE(25);
                                bbwtVar.z = fayvVar2;
                            }
                            if (strArr14 != null) {
                                String str9 = strArr14[i12];
                                int i43 = bbwtVar.aB;
                                if (i43 < 0) {
                                    dtub.w("cms_id", i43);
                                }
                                bbwtVar.aE(26);
                                bbwtVar.A = str9;
                            }
                            if (csggVarArr2 != null) {
                                csgg csggVar = csggVarArr2[i12];
                                int i44 = bbwtVar.aB;
                                if (i44 < 0) {
                                    dtub.w("cms_life_cycle", i44);
                                }
                                bbwtVar.aE(27);
                                bbwtVar.B = csggVar;
                            }
                            if (strArr15 != null) {
                                String str10 = strArr15[i12];
                                int i45 = bbwtVar.aB;
                                if (i45 < 0) {
                                    dtub.w("cms_correlation_id", i45);
                                }
                                bbwtVar.aE(28);
                                bbwtVar.C = str10;
                            }
                            if (jArr4 != null) {
                                long j5 = jArr4[i12];
                                int i46 = bbwtVar.aB;
                                if (i46 < 0) {
                                    dtub.w("cms_last_mod_seq", i46);
                                }
                                bbwtVar.aE(29);
                                bbwtVar.D = j5;
                            }
                            bbwr bbwrVar = new bbwr();
                            bbwrVar.aC(bbwtVar.aB());
                            bbwrVar.a = bbwtVar.a;
                            bbwrVar.b = bbwtVar.b;
                            bbwrVar.c = bbwtVar.c;
                            bbwrVar.d = bbwtVar.d;
                            bbwrVar.e = bbwtVar.e;
                            bbwrVar.f = bbwtVar.f;
                            bbwrVar.g = bbwtVar.g;
                            bbwrVar.h = bbwtVar.h;
                            bbwrVar.i = bbwtVar.i;
                            bbwrVar.j = bbwtVar.j;
                            bbwrVar.k = bbwtVar.k;
                            bbwrVar.l = bbwtVar.l;
                            bbwrVar.m = bbwtVar.m;
                            bbwrVar.n = bbwtVar.n;
                            bbwrVar.o = bbwtVar.o;
                            bbwrVar.p = bbwtVar.p;
                            bbwrVar.q = bbwtVar.q;
                            bbwrVar.r = bbwtVar.r;
                            bbwrVar.s = bbwtVar.s;
                            bbwrVar.t = bbwtVar.t;
                            bbwrVar.u = bbwtVar.u;
                            bbwrVar.v = bbwtVar.v;
                            bbwrVar.w = bbwtVar.w;
                            bbwrVar.x = bbwtVar.x;
                            bbwrVar.y = bbwtVar.y;
                            bbwrVar.z = bbwtVar.z;
                            bbwrVar.A = bbwtVar.A;
                            bbwrVar.B = bbwtVar.B;
                            bbwrVar.C = bbwtVar.C;
                            bbwrVar.D = bbwtVar.D;
                            bbwrVar.cK = bbwtVar.aC();
                            engrVar.h(bbwrVar);
                            i12++;
                            strArr19 = strArr15;
                            length = i;
                            B2 = jArr4;
                            csggVarArr = csggVarArr2;
                        }
                    } else {
                        strArr15 = strArr19;
                    }
                    i = length;
                    jArr4 = B2;
                    csggVarArr2 = csggVarArr;
                    i12++;
                    strArr19 = strArr15;
                    length = i;
                    B2 = jArr4;
                    csggVarArr = csggVarArr2;
                }
                return engrVar.g();
            }
        }
        int i47 = engw.d;
        return enou.a;
    }

    public final int g() {
        return getInt(cM(16, bcba.a));
    }

    public final int h() {
        return getInt(cM(10, bcba.a));
    }

    public final int i() {
        return getInt(cM(7, bcba.a));
    }

    public final int j() {
        return getInt(cM(19, bcba.a));
    }

    public final long k() {
        return getLong(cM(29, bcba.a));
    }

    public final long l() {
        return getLong(cM(12, bcba.a));
    }

    public final long m() {
        return getLong(cM(13, bcba.a));
    }

    public final azsu n() {
        return azsv.a(getString(cM(2, bcba.a)));
    }

    public final ConversationIdType o() {
        return new ConversationIdType(getLong(cM(6, bcba.a)));
    }

    public final MessageIdType p() {
        return new MessageIdType(getLong(cM(0, bcba.a)));
    }

    public final bdhg q() {
        return bdhg.a(getString(cM(24, bcba.a)));
    }

    public final csgg r() {
        csgg[] values = csgg.values();
        int i = getInt(cM(27, bcba.a));
        if (i < values.length) {
            return values[i];
        }
        throw new IllegalArgumentException();
    }

    public final fayv s() {
        byte[] blob = getBlob(cM(25, bcba.a));
        if (blob == null) {
            return null;
        }
        try {
            return (fayv) eyfy.parseFrom(fayv.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return fayv.a;
        }
    }

    public final Optional t() {
        return bdhj.a(getString(cM(1, bcba.a)));
    }

    public final String u() {
        return getString(cM(17, bcba.a));
    }

    public final String v() {
        return getString(cM(28, bcba.a));
    }

    public final String w() {
        return getString(cM(26, bcba.a));
    }

    public final String x() {
        return getString(cM(18, bcba.a));
    }

    public final String y() {
        return getString(cM(22, bcba.a));
    }

    public final String z() {
        return getString(cM(11, bcba.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
