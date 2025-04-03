package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbte extends dtsr implements bbsx {
    @Deprecated
    public bbte(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bbtl bbtlVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bbtp.a, dtyoVar, dtvsVar, bbtlVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bbse();
    }

    public final long c() {
        return getLong(cM(0, bbtp.a));
    }

    public final MessageIdType e() {
        return new MessageIdType(getLong(cM(1, bbtp.a)));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(3, bbtp.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        cmrf[] cmrfVarArr;
        MessageIdType[] messageIdTypeArr2;
        cmrv[] cmrvVarArr;
        long[] jArr;
        cmrl cmrlVar;
        cmrf cmrfVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                cmrl[] cmrlVarArr = null;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bbtp.a)))) : new long[]{c()} : null;
                dtsr.dy(length, B, new emyl() { // from class: bbsy
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(bbte.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bbtp.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        messageIdTypeArr3[i2] = new MessageIdType(ds[i2]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{e()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bbsz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(bbte.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    cmrfVarArr = null;
                } else if (z) {
                    List de = de(getString(cM(2, bbtp.a)));
                    cmrf[] cmrfVarArr2 = new cmrf[de.size()];
                    Iterator it = de.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i4 = i3 + 1;
                            if (y == null) {
                                cmrfVar = null;
                            } else {
                                try {
                                    cmrfVar = (cmrf) eyfy.parseFrom(cmrf.a, y);
                                } catch (Throwable unused) {
                                    i3 = i4;
                                    cmrfVarArr2[i3] = null;
                                    i3++;
                                }
                            }
                            cmrfVarArr2[i3] = cmrfVar;
                            i3 = i4;
                        } catch (Throwable unused2) {
                        }
                    }
                    cmrfVarArr = (cmrf[]) dtub.C(null, cmrfVarArr2, new cmrf[0]);
                } else {
                    cmrfVarArr = new cmrf[]{g()};
                }
                dtsr.dz(length, cmrfVarArr, new emyl() { // from class: bbta
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "reactions_data:".concat(String.valueOf(bbte.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    messageIdTypeArr2 = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(3, bbtp.a)));
                    int length3 = ds2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    int i5 = 0;
                    while (i5 < length3) {
                        long[] jArr2 = ds2;
                        messageIdTypeArr4[i5] = new MessageIdType(jArr2[i5]);
                        i5++;
                        ds2 = jArr2;
                    }
                    messageIdTypeArr2 = (MessageIdType[]) dtub.C(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    messageIdTypeArr2 = new MessageIdType[]{f()};
                }
                dtsr.dz(length, messageIdTypeArr2, new emyl() { // from class: bbtb
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "reacted_message_id:".concat(String.valueOf(bbte.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    cmrvVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, bbtp.a)));
                    cmrv[] cmrvVarArr2 = new cmrv[dr.length];
                    for (int i6 = 0; i6 < dr.length; i6++) {
                        cmrv b = cmrv.b(dr[i6]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        cmrvVarArr2[i6] = b;
                    }
                    cmrvVarArr = (cmrv[]) dtub.C(null, cmrvVarArr2, new cmrv[0]);
                } else {
                    cmrvVarArr = new cmrv[]{i()};
                }
                dtsr.dz(length, cmrvVarArr, new emyl() { // from class: bbtc
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "reaction:".concat(String.valueOf(bbte.this.getString(4)));
                    }
                });
                if (di(5)) {
                    if (z) {
                        List de2 = de(getString(cM(5, bbtp.a)));
                        cmrl[] cmrlVarArr2 = new cmrl[de2.size()];
                        Iterator it2 = de2.iterator();
                        int i7 = 0;
                        while (it2.hasNext()) {
                            try {
                                byte[] y2 = dtub.y((String) it2.next());
                                int i8 = i7 + 1;
                                if (y2 == null) {
                                    cmrlVar = null;
                                } else {
                                    try {
                                        cmrlVar = (cmrl) eyfy.parseFrom(cmrl.a, y2);
                                    } catch (Throwable unused3) {
                                        i7 = i8;
                                        cmrlVarArr2[i7] = null;
                                        i7++;
                                    }
                                }
                                cmrlVarArr2[i7] = cmrlVar;
                                i7 = i8;
                            } catch (Throwable unused4) {
                            }
                        }
                        cmrlVarArr = (cmrl[]) dtub.C(null, cmrlVarArr2, new cmrl[0]);
                    } else {
                        cmrlVarArr = new cmrl[]{h()};
                    }
                }
                dtsr.dz(length, cmrlVarArr, new emyl() { // from class: bbtd
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "applied_reaction:".concat(String.valueOf(bbte.this.getString(5)));
                    }
                });
                engr engrVar = new engr();
                int i9 = 0;
                while (i9 < length) {
                    long j = dB[i9];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        jArr = dB;
                    } else {
                        hashSet.add(Long.valueOf(dB[i9]));
                        String[] strArr = bbtp.a;
                        bbsg bbsgVar = new bbsg();
                        bbsgVar.aF();
                        bbsgVar.aD();
                        long j2 = dB[i9];
                        if (B != null) {
                            long j3 = B[i9];
                            bbsgVar.aE(i);
                            bbsgVar.a = j3;
                        }
                        if (messageIdTypeArr != null) {
                            MessageIdType messageIdType = messageIdTypeArr[i9];
                            bbsgVar.aE(1);
                            bbsgVar.b = messageIdType;
                        }
                        if (cmrfVarArr != null) {
                            cmrf cmrfVar2 = cmrfVarArr[i9];
                            bbsgVar.aE(2);
                            bbsgVar.c = cmrfVar2;
                        }
                        if (messageIdTypeArr2 != null) {
                            MessageIdType messageIdType2 = messageIdTypeArr2[i9];
                            bbsgVar.aE(3);
                            bbsgVar.d = messageIdType2;
                        }
                        if (cmrvVarArr != null) {
                            cmrv cmrvVar = cmrvVarArr[i9];
                            bbsgVar.aE(4);
                            bbsgVar.e = cmrvVar;
                        }
                        if (cmrlVarArr != null) {
                            cmrl cmrlVar2 = cmrlVarArr[i9];
                            bbsgVar.aE(5);
                            bbsgVar.f = cmrlVar2;
                        }
                        bbse bbseVar = new bbse();
                        bbseVar.aC(bbsgVar.aB());
                        jArr = dB;
                        bbseVar.a = bbsgVar.a;
                        bbseVar.b = bbsgVar.b;
                        bbseVar.c = bbsgVar.c;
                        bbseVar.d = bbsgVar.d;
                        bbseVar.e = bbsgVar.e;
                        bbseVar.f = bbsgVar.f;
                        bbseVar.cK = bbsgVar.aC();
                        engrVar.h(bbseVar);
                    }
                    i9++;
                    dB = jArr;
                    i = 0;
                }
                return engrVar.g();
            }
        }
        int i10 = engw.d;
        return enou.a;
    }

    public final cmrf g() {
        byte[] blob = getBlob(cM(2, bbtp.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cmrf) eyfy.parseFrom(cmrf.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cmrf.a;
        }
    }

    public final cmrl h() {
        byte[] blob = getBlob(cM(5, bbtp.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cmrl) eyfy.parseFrom(cmrl.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cmrl.a;
        }
    }

    public final cmrv i() {
        return cmrv.b(getInt(cM(4, bbtp.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
