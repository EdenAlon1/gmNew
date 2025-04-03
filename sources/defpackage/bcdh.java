package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcdh extends dtsr implements bccr {
    @Deprecated
    public bcdh(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bcdo bcdoVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bcds.a, dtyoVar, dtvsVar, bcdoVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bcbh();
    }

    public final double c() {
        return getDouble(cM(8, bcds.a));
    }

    public final double e() {
        return getDouble(cM(7, bcds.a));
    }

    public final int f() {
        return getInt(cM(6, bcds.a));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        int i;
        double[] dArr;
        long[] jArr;
        String[] strArr;
        byte[][] bArr;
        byte[][] bArr2;
        byte[][] bArr3;
        double[] dArr2;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        int i2;
        int i3;
        engr engrVar;
        HashSet hashSet;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i4 = engw.d;
            return enou.a;
        }
        HashSet hashSet2 = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bcds.a)))) : new long[]{j()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bccs
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bcdh.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bcds.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                messageIdTypeArr2[i5] = new MessageIdType(ds[i5]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{k()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bcdd
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bcdh.this.getString(1)));
            }
        });
        String[] strArr6 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bcds.a))), new String[0]) : new String[]{n()} : null;
        dtsr.dz(length, strArr6, new emyl() { // from class: bcde
            @Override // defpackage.emyl
            public final Object get() {
                return "content_type:".concat(String.valueOf(bcdh.this.getString(2)));
            }
        });
        int[] z2 = di(3) ? z ? dtub.z(null, dr(getString(cM(3, bcds.a)))) : new int[]{g()} : null;
        dtsr.dx(length, z2, new emyl() { // from class: bcdf
            @Override // defpackage.emyl
            public final Object get() {
                return "source:".concat(String.valueOf(bcdh.this.getString(3)));
            }
        });
        String[] strArr7 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bcds.a))), new String[0]) : new String[]{p()} : null;
        dtsr.dz(length, strArr7, new emyl() { // from class: bcdg
            @Override // defpackage.emyl
            public final Object get() {
                return "text:".concat(String.valueOf(bcdh.this.getString(4)));
            }
        });
        int[] z3 = di(5) ? z ? dtub.z(null, dr(getString(cM(5, bcds.a)))) : new int[]{h()} : null;
        dtsr.dx(length, z3, new emyl() { // from class: bcct
            @Override // defpackage.emyl
            public final Object get() {
                return "width:".concat(String.valueOf(bcdh.this.getString(5)));
            }
        });
        int[] z4 = di(6) ? z ? dtub.z(null, dr(getString(cM(6, bcds.a)))) : new int[]{f()} : null;
        dtsr.dx(length, z4, new emyl() { // from class: bccu
            @Override // defpackage.emyl
            public final Object get() {
                return "height:".concat(String.valueOf(bcdh.this.getString(6)));
            }
        });
        double[] G = di(7) ? z ? dtub.G(dp(getString(cM(7, bcds.a)))) : new double[]{e()} : null;
        dtsr.dv(length, G, new emyl() { // from class: bccv
            @Override // defpackage.emyl
            public final Object get() {
                return "longitude:".concat(String.valueOf(bcdh.this.getString(7)));
            }
        });
        if (!di(8)) {
            i = 0;
            dArr = null;
        } else if (z) {
            i = 0;
            dArr = dtub.G(dp(getString(cM(8, bcds.a))));
        } else {
            i = 0;
            dArr = new double[]{c()};
        }
        dtsr.dv(length, dArr, new emyl() { // from class: bccw
            @Override // defpackage.emyl
            public final Object get() {
                return "latitude:".concat(String.valueOf(bcdh.this.getString(8)));
            }
        });
        if (!di(9)) {
            jArr = dB;
            strArr = null;
        } else if (z) {
            jArr = dB;
            strArr = (String[]) dtub.C(null, dt(getString(cM(9, bcds.a))), new String[i]);
        } else {
            jArr = dB;
            String[] strArr8 = new String[1];
            strArr8[i] = m();
            strArr = strArr8;
        }
        dtsr.dz(length, strArr, new emyl() { // from class: bccx
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_full_size_blob_id:".concat(String.valueOf(bcdh.this.getString(9)));
            }
        });
        byte[][] E = di(10) ? z ? dtub.E(null, dC(getString(cM(10, bcds.a)))) : new byte[][]{r()} : null;
        dtsr.dz(length, E, new emyl() { // from class: bccy
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_media_encryption_key:".concat(String.valueOf(bcdh.this.getString(10)));
            }
        });
        if (!di(11)) {
            bArr = E;
            bArr2 = null;
        } else if (z) {
            bArr = E;
            bArr2 = dtub.E(null, dC(getString(cM(11, bcds.a))));
        } else {
            bArr = E;
            bArr2 = new byte[][]{q()};
        }
        dtsr.dz(length, bArr2, new emyl() { // from class: bccz
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_compressed_media_encryption_key:".concat(String.valueOf(bcdh.this.getString(11)));
            }
        });
        if (!di(12)) {
            bArr3 = bArr2;
            dArr2 = dArr;
            strArr2 = null;
        } else if (z) {
            bArr3 = bArr2;
            dArr2 = dArr;
            strArr2 = (String[]) dtub.C(null, dt(getString(cM(12, bcds.a))), new String[0]);
        } else {
            bArr3 = bArr2;
            dArr2 = dArr;
            strArr2 = new String[]{l()};
        }
        dtsr.dz(length, strArr2, new emyl() { // from class: bcda
            @Override // defpackage.emyl
            public final Object get() {
                return "cms_compressed_blob_id:".concat(String.valueOf(bcdh.this.getString(12)));
            }
        });
        if (!di(13)) {
            strArr3 = strArr2;
            strArr4 = null;
        } else if (z) {
            strArr3 = strArr2;
            strArr4 = (String[]) dtub.C(null, dt(getString(cM(13, bcds.a))), new String[0]);
        } else {
            strArr3 = strArr2;
            strArr4 = new String[]{o()};
        }
        dtsr.dz(length, strArr4, new emyl() { // from class: bcdb
            @Override // defpackage.emyl
            public final Object get() {
                return "file_name:".concat(String.valueOf(bcdh.this.getString(13)));
            }
        });
        long[] B2 = di(14) ? z ? dtub.B(null, ds(getString(cM(14, bcds.a)))) : new long[]{i()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bcdc
            @Override // defpackage.emyl
            public final Object get() {
                return "duration:".concat(String.valueOf(bcdh.this.getString(14)));
            }
        });
        engr engrVar2 = new engr();
        int i6 = 0;
        while (i6 < length) {
            long j = jArr[i6];
            if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                strArr5 = strArr4;
                i2 = i6;
                i3 = length;
                engrVar = engrVar2;
                hashSet = hashSet2;
            } else {
                hashSet2.add(Long.valueOf(jArr[i6]));
                String[] strArr9 = bcds.a;
                bcbj bcbjVar = new bcbj();
                bcbjVar.aF();
                bcbjVar.aD();
                long j2 = jArr[i6];
                strArr5 = strArr4;
                i2 = i6;
                if (B != null) {
                    long j3 = B[i2];
                    i3 = length;
                    bcbjVar.aE(0);
                    bcbjVar.a = j3;
                } else {
                    i3 = length;
                }
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i2];
                    int i7 = bcbjVar.aB;
                    if (i7 < 0) {
                        dtub.w("message_id", i7);
                    }
                    bcbjVar.aE(1);
                    bcbjVar.b = messageIdType;
                }
                if (strArr6 != null) {
                    String str = strArr6[i2];
                    int i8 = bcbjVar.aB;
                    if (i8 < 0) {
                        dtub.w("content_type", i8);
                    }
                    bcbjVar.aE(2);
                    bcbjVar.c = str;
                }
                if (z2 != null) {
                    int i9 = z2[i2];
                    int i10 = bcbjVar.aB;
                    if (i10 < 10) {
                        dtub.w("source", i10);
                    }
                    bcbjVar.aE(3);
                    bcbjVar.d = i9;
                }
                if (strArr7 != null) {
                    String str2 = strArr7[i2];
                    int i11 = bcbjVar.aB;
                    if (i11 < 0) {
                        dtub.w(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, i11);
                    }
                    bcbjVar.aE(4);
                    bcbjVar.e = str2;
                }
                if (z3 != null) {
                    int i12 = z3[i2];
                    int i13 = bcbjVar.aB;
                    if (i13 < 0) {
                        dtub.w("width", i13);
                    }
                    bcbjVar.aE(5);
                    bcbjVar.f = i12;
                }
                if (z4 != null) {
                    int i14 = z4[i2];
                    int i15 = bcbjVar.aB;
                    if (i15 < 0) {
                        dtub.w("height", i15);
                    }
                    bcbjVar.aE(6);
                    bcbjVar.g = i14;
                }
                if (G != null) {
                    double d = G[i2];
                    int i16 = bcbjVar.aB;
                    hashSet = hashSet2;
                    if (i16 < 0) {
                        dtub.w("longitude", i16);
                    }
                    bcbjVar.aE(7);
                    bcbjVar.h = d;
                } else {
                    hashSet = hashSet2;
                }
                if (dArr2 != null) {
                    double d2 = dArr2[i2];
                    int i17 = bcbjVar.aB;
                    if (i17 < 0) {
                        dtub.w("latitude", i17);
                    }
                    bcbjVar.aE(8);
                    bcbjVar.i = d2;
                }
                if (strArr != null) {
                    String str3 = strArr[i2];
                    int i18 = bcbjVar.aB;
                    if (i18 < 0) {
                        dtub.w("cms_full_size_blob_id", i18);
                    }
                    bcbjVar.aE(9);
                    bcbjVar.j = str3;
                }
                if (bArr != null) {
                    byte[] bArr4 = bArr[i2];
                    int i19 = bcbjVar.aB;
                    if (i19 < 0) {
                        dtub.w("cms_media_encryption_key", i19);
                    }
                    bcbjVar.aE(10);
                    bcbjVar.k = bArr4;
                }
                if (bArr3 != null) {
                    byte[] bArr5 = bArr3[i2];
                    int i20 = bcbjVar.aB;
                    if (i20 < 0) {
                        dtub.w("cms_compressed_media_encryption_key", i20);
                    }
                    bcbjVar.aE(11);
                    bcbjVar.l = bArr5;
                }
                if (strArr3 != null) {
                    String str4 = strArr3[i2];
                    int i21 = bcbjVar.aB;
                    if (i21 < 0) {
                        dtub.w("cms_compressed_blob_id", i21);
                    }
                    bcbjVar.aE(12);
                    bcbjVar.m = str4;
                }
                if (strArr5 != null) {
                    String str5 = strArr5[i2];
                    int i22 = bcbjVar.aB;
                    if (i22 < 100) {
                        dtub.w("file_name", i22);
                    }
                    bcbjVar.aE(13);
                    bcbjVar.n = str5;
                }
                if (B2 != null) {
                    long j4 = B2[i2];
                    int i23 = bcbjVar.aB;
                    if (i23 < 130) {
                        dtub.w("duration", i23);
                    }
                    bcbjVar.aE(14);
                    bcbjVar.o = j4;
                }
                bcbh bcbhVar = new bcbh();
                bcbhVar.aC(bcbjVar.aB());
                engrVar = engrVar2;
                bcbhVar.a = bcbjVar.a;
                bcbhVar.b = bcbjVar.b;
                bcbhVar.c = bcbjVar.c;
                bcbhVar.d = bcbjVar.d;
                bcbhVar.e = bcbjVar.e;
                bcbhVar.f = bcbjVar.f;
                bcbhVar.g = bcbjVar.g;
                bcbhVar.h = bcbjVar.h;
                bcbhVar.i = bcbjVar.i;
                bcbhVar.j = bcbjVar.j;
                bcbhVar.k = bcbjVar.k;
                bcbhVar.l = bcbjVar.l;
                bcbhVar.m = bcbjVar.m;
                bcbhVar.n = bcbjVar.n;
                bcbhVar.o = bcbjVar.o;
                bcbhVar.cK = bcbjVar.aC();
                engrVar.h(bcbhVar);
            }
            engrVar2 = engrVar;
            strArr4 = strArr5;
            length = i3;
            hashSet2 = hashSet;
            i6 = i2 + 1;
        }
        return engrVar2.g();
    }

    public final int g() {
        return getInt(cM(3, bcds.a));
    }

    public final int h() {
        return getInt(cM(5, bcds.a));
    }

    public final long i() {
        return getLong(cM(14, bcds.a));
    }

    public final long j() {
        return getLong(cM(0, bcds.a));
    }

    public final MessageIdType k() {
        return new MessageIdType(getLong(cM(1, bcds.a)));
    }

    public final String l() {
        return getString(cM(12, bcds.a));
    }

    public final String m() {
        return getString(cM(9, bcds.a));
    }

    public final String n() {
        return getString(cM(2, bcds.a));
    }

    public final String o() {
        return getString(cM(13, bcds.a));
    }

    public final String p() {
        return getString(cM(4, bcds.a));
    }

    public final byte[] q() {
        return getBlob(cM(11, bcds.a));
    }

    public final byte[] r() {
        return getBlob(cM(10, bcds.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
