package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class budu extends dtsr implements budm {
    @Deprecated
    public budu(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, buea bueaVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bueg.a, dtyoVar, dtvsVar, bueaVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bucp();
    }

    @Override // defpackage.budm
    public final MessageIdType c() {
        return new MessageIdType(getLong(cM(3, bueg.a)));
    }

    @Override // defpackage.budm
    public final engw e() {
        engr engrVar = new engr();
        while (moveToNext()) {
            g();
            engrVar.h(g());
        }
        return engrVar.g();
    }

    public final long f() {
        return getLong(cM(0, bueg.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        cmrf[] cmrfVarArr;
        int i;
        MessageIdType[] messageIdTypeArr2;
        cmrv[] cmrvVarArr;
        cmrl[] cmrlVarArr;
        cmrl[] cmrlVarArr2;
        cmrl cmrlVar;
        cmrl cmrlVar2;
        cmrf cmrfVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length != 0) {
            int i2 = 0;
            if (length != 1 || dB[0] != -1) {
                HashSet hashSet = new HashSet();
                dtvs dtvsVar = this.d;
                boolean di = di(0);
                boolean z = dtvsVar.b;
                long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bueg.a)))) : new long[]{f()} : null;
                dtsr.dy(length, B, new emyl() { // from class: budn
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "_id:".concat(String.valueOf(budu.this.getString(0)));
                    }
                });
                if (!di(1)) {
                    messageIdTypeArr = null;
                } else if (z) {
                    long[] ds = ds(getString(cM(1, bueg.a)));
                    int length2 = ds.length;
                    MessageIdType[] messageIdTypeArr3 = new MessageIdType[length2];
                    for (int i3 = 0; i3 < length2; i3++) {
                        messageIdTypeArr3[i3] = new MessageIdType(ds[i3]);
                    }
                    messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr3, new MessageIdType[0]);
                } else {
                    messageIdTypeArr = new MessageIdType[]{g()};
                }
                dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: budo
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "message_id:".concat(String.valueOf(budu.this.getString(1)));
                    }
                });
                if (!di(2)) {
                    cmrfVarArr = null;
                } else if (z) {
                    List de = de(getString(cM(2, bueg.a)));
                    cmrf[] cmrfVarArr2 = new cmrf[de.size()];
                    Iterator it = de.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] y = dtub.y((String) it.next());
                            int i5 = i4 + 1;
                            if (y == null) {
                                cmrfVar = null;
                            } else {
                                try {
                                    cmrfVar = (cmrf) eyfy.parseFrom(cmrf.a, y);
                                } catch (Throwable unused) {
                                    i4 = i5;
                                    cmrfVarArr2[i4] = null;
                                    i4++;
                                }
                            }
                            cmrfVarArr2[i4] = cmrfVar;
                            i4 = i5;
                        } catch (Throwable unused2) {
                        }
                    }
                    cmrfVarArr = (cmrf[]) dtub.C(null, cmrfVarArr2, new cmrf[0]);
                } else {
                    cmrfVarArr = new cmrf[]{h()};
                }
                dtsr.dz(length, cmrfVarArr, new emyl() { // from class: budp
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "reactions_data:".concat(String.valueOf(budu.this.getString(2)));
                    }
                });
                if (!di(3)) {
                    i = length;
                    messageIdTypeArr2 = null;
                } else if (z) {
                    long[] ds2 = ds(getString(cM(3, bueg.a)));
                    int length3 = ds2.length;
                    MessageIdType[] messageIdTypeArr4 = new MessageIdType[length3];
                    int i6 = 0;
                    while (i6 < length3) {
                        messageIdTypeArr4[i6] = new MessageIdType(ds2[i6]);
                        i6++;
                        length = length;
                    }
                    i = length;
                    messageIdTypeArr2 = (MessageIdType[]) dtub.C(null, messageIdTypeArr4, new MessageIdType[0]);
                } else {
                    i = length;
                    messageIdTypeArr2 = new MessageIdType[]{c()};
                }
                dtsr.dz(i, messageIdTypeArr2, new emyl() { // from class: budq
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "reacted_message_id:".concat(String.valueOf(budu.this.getString(3)));
                    }
                });
                if (!di(4)) {
                    cmrvVarArr = null;
                } else if (z) {
                    int[] dr = dr(getString(cM(4, bueg.a)));
                    cmrv[] cmrvVarArr2 = new cmrv[dr.length];
                    for (int i7 = 0; i7 < dr.length; i7++) {
                        cmrv b = cmrv.b(dr[i7]);
                        if (b == null) {
                            throw new IllegalStateException();
                        }
                        cmrvVarArr2[i7] = b;
                    }
                    cmrvVarArr = (cmrv[]) dtub.C(null, cmrvVarArr2, new cmrv[0]);
                } else {
                    cmrvVarArr = new cmrv[]{k()};
                }
                dtsr.dz(i, cmrvVarArr, new emyl() { // from class: budr
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "reaction:".concat(String.valueOf(budu.this.getString(4)));
                    }
                });
                if (!di(5)) {
                    cmrlVarArr = null;
                } else if (z) {
                    List de2 = de(getString(cM(5, bueg.a)));
                    cmrl[] cmrlVarArr3 = new cmrl[de2.size()];
                    Iterator it2 = de2.iterator();
                    int i8 = 0;
                    while (it2.hasNext()) {
                        try {
                            byte[] y2 = dtub.y((String) it2.next());
                            int i9 = i8 + 1;
                            if (y2 == null) {
                                cmrlVar2 = null;
                            } else {
                                try {
                                    cmrlVar2 = (cmrl) eyfy.parseFrom(cmrl.a, y2);
                                } catch (Throwable unused3) {
                                    i8 = i9;
                                    cmrlVarArr3[i8] = null;
                                    i8++;
                                    i2 = 0;
                                }
                            }
                            cmrlVarArr3[i8] = cmrlVar2;
                            i8 = i9;
                        } catch (Throwable unused4) {
                        }
                        i2 = 0;
                    }
                    cmrlVarArr = (cmrl[]) dtub.C(null, cmrlVarArr3, new cmrl[i2]);
                } else {
                    cmrlVarArr = new cmrl[]{j()};
                }
                dtsr.dz(i, cmrlVarArr, new emyl() { // from class: buds
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "applied_reaction:".concat(String.valueOf(budu.this.getString(5)));
                    }
                });
                if (!di(6)) {
                    cmrlVarArr2 = null;
                } else if (z) {
                    List de3 = de(getString(cM(6, bueg.a)));
                    cmrl[] cmrlVarArr4 = new cmrl[de3.size()];
                    Iterator it3 = de3.iterator();
                    int i10 = 0;
                    while (it3.hasNext()) {
                        try {
                            byte[] y3 = dtub.y((String) it3.next());
                            int i11 = i10 + 1;
                            if (y3 == null) {
                                cmrlVar = null;
                            } else {
                                try {
                                    cmrlVar = (cmrl) eyfy.parseFrom(cmrl.a, y3);
                                } catch (Throwable unused5) {
                                    i10 = i11;
                                    cmrlVarArr4[i10] = null;
                                    i10++;
                                }
                            }
                            cmrlVarArr4[i10] = cmrlVar;
                            i10 = i11;
                        } catch (Throwable unused6) {
                        }
                    }
                    cmrlVarArr2 = (cmrl[]) dtub.C(null, cmrlVarArr4, new cmrl[0]);
                } else {
                    cmrlVarArr2 = new cmrl[]{i()};
                }
                dtsr.dz(i, cmrlVarArr2, new emyl() { // from class: budt
                    @Override // defpackage.emyl
                    public final Object get() {
                        return "animation_effect:".concat(String.valueOf(budu.this.getString(6)));
                    }
                });
                engr engrVar = new engr();
                for (int i12 = 0; i12 < i; i12++) {
                    long j = dB[i12];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(dB[i12]));
                        String[] strArr = bueg.a;
                        buct buctVar = new buct();
                        buctVar.aF();
                        buctVar.aD();
                        long j2 = dB[i12];
                        if (B != null) {
                            long j3 = B[i12];
                            buctVar.aE(0);
                            buctVar.a = j3;
                        }
                        if (messageIdTypeArr != null) {
                            buctVar.e(messageIdTypeArr[i12]);
                        }
                        if (cmrfVarArr != null) {
                            buctVar.h(cmrfVarArr[i12]);
                        }
                        if (messageIdTypeArr2 != null) {
                            buctVar.f(messageIdTypeArr2[i12]);
                        }
                        if (cmrvVarArr != null) {
                            buctVar.g(cmrvVarArr[i12]);
                        }
                        if (cmrlVarArr != null) {
                            buctVar.d(cmrlVarArr[i12]);
                        }
                        if (cmrlVarArr2 != null) {
                            buctVar.c(cmrlVarArr2[i12]);
                        }
                        engrVar.h(buctVar.a());
                    }
                }
                return engrVar.g();
            }
        }
        int i13 = engw.d;
        return enou.a;
    }

    public final MessageIdType g() {
        return new MessageIdType(getLong(cM(1, bueg.a)));
    }

    public final cmrf h() {
        byte[] blob = getBlob(cM(2, bueg.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cmrf) eyfy.parseFrom(cmrf.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cmrf.a;
        }
    }

    public final cmrl i() {
        byte[] blob = getBlob(cM(6, bueg.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cmrl) eyfy.parseFrom(cmrl.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cmrl.a;
        }
    }

    public final cmrl j() {
        byte[] blob = getBlob(cM(5, bueg.a));
        if (blob == null) {
            return null;
        }
        try {
            return (cmrl) eyfy.parseFrom(cmrl.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return cmrl.a;
        }
    }

    public final cmrv k() {
        return cmrv.b(getInt(cM(4, bueg.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
