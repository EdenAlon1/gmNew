package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbqk extends dtsr implements bbqa {
    @Deprecated
    public bbqk(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bbqq bbqqVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bbqu.a, dtyoVar, dtvsVar, bbqqVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bbpc();
    }

    public final long c() {
        return getLong(cM(3, bbqu.a));
    }

    public final long e() {
        return getLong(cM(0, bbqu.a));
    }

    public final MessageIdType f() {
        return new MessageIdType(getLong(cM(1, bbqu.a)));
    }

    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        MessageIdType[] messageIdTypeArr;
        long[] jArr;
        String[] strArr;
        int i;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i2 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bbqu.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bbqb
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bbqk.this.getString(0)));
            }
        });
        if (!di(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(1, bbqu.a)));
            int length2 = ds.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                messageIdTypeArr2[i3] = new MessageIdType(ds[i3]);
            }
            messageIdTypeArr = (MessageIdType[]) dtub.C(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{f()};
        }
        dtsr.dz(length, messageIdTypeArr, new emyl() { // from class: bbqc
            @Override // defpackage.emyl
            public final Object get() {
                return "message_id:".concat(String.valueOf(bbqk.this.getString(1)));
            }
        });
        String[] strArr2 = di(2) ? z ? (String[]) dtub.C(null, dt(getString(cM(2, bbqu.a))), new String[0]) : new String[]{l()} : null;
        dtsr.dz(length, strArr2, new emyl() { // from class: bbqd
            @Override // defpackage.emyl
            public final Object get() {
                return "trigger_url:".concat(String.valueOf(bbqk.this.getString(2)));
            }
        });
        long[] B2 = di(3) ? z ? dtub.B(null, ds(getString(cM(3, bbqu.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bbqe
            @Override // defpackage.emyl
            public final Object get() {
                return "expiration_time_millis:".concat(String.valueOf(bbqk.this.getString(3)));
            }
        });
        String[] strArr3 = di(4) ? z ? (String[]) dtub.C(null, dt(getString(cM(4, bbqu.a))), new String[0]) : new String[]{k()} : null;
        dtsr.dz(length, strArr3, new emyl() { // from class: bbqf
            @Override // defpackage.emyl
            public final Object get() {
                return "link_title:".concat(String.valueOf(bbqk.this.getString(4)));
            }
        });
        String[] strArr4 = di(5) ? z ? (String[]) dtub.C(null, dt(getString(cM(5, bbqu.a))), new String[0]) : new String[]{h()} : null;
        dtsr.dz(length, strArr4, new emyl() { // from class: bbqg
            @Override // defpackage.emyl
            public final Object get() {
                return "link_description:".concat(String.valueOf(bbqk.this.getString(5)));
            }
        });
        String[] strArr5 = di(6) ? z ? (String[]) dtub.C(null, dt(getString(cM(6, bbqu.a))), new String[0]) : new String[]{j()} : null;
        dtsr.dz(length, strArr5, new emyl() { // from class: bbqh
            @Override // defpackage.emyl
            public final Object get() {
                return "link_image_url:".concat(String.valueOf(bbqk.this.getString(6)));
            }
        });
        String[] strArr6 = di(7) ? z ? (String[]) dtub.C(null, dt(getString(cM(7, bbqu.a))), new String[0]) : new String[]{i()} : null;
        dtsr.dz(length, strArr6, new emyl() { // from class: bbqi
            @Override // defpackage.emyl
            public final Object get() {
                return "link_domain:".concat(String.valueOf(bbqk.this.getString(7)));
            }
        });
        String[] strArr7 = di(8) ? z ? (String[]) dtub.C(null, dt(getString(cM(8, bbqu.a))), new String[0]) : new String[]{g()} : null;
        dtsr.dz(length, strArr7, new emyl() { // from class: bbqj
            @Override // defpackage.emyl
            public final Object get() {
                return "link_canonical_url:".concat(String.valueOf(bbqk.this.getString(8)));
            }
        });
        engr engrVar = new engr();
        int i4 = 0;
        while (i4 < length) {
            long j = dB[i4];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                jArr = dB;
                strArr = strArr6;
                i = length;
            } else {
                hashSet.add(Long.valueOf(dB[i4]));
                String[] strArr8 = bbqu.a;
                bbpe bbpeVar = new bbpe();
                bbpeVar.aF();
                bbpeVar.aD();
                long j2 = dB[i4];
                jArr = dB;
                if (B != null) {
                    long j3 = B[i4];
                    strArr = strArr6;
                    bbpeVar.aE(0);
                    bbpeVar.a = j3;
                } else {
                    strArr = strArr6;
                }
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i4];
                    bbpeVar.aE(1);
                    bbpeVar.b = messageIdType;
                }
                if (strArr2 != null) {
                    String str = strArr2[i4];
                    bbpeVar.aE(2);
                    bbpeVar.c = str;
                }
                if (B2 != null) {
                    long j4 = B2[i4];
                    bbpeVar.aE(3);
                    bbpeVar.d = j4;
                }
                if (strArr3 != null) {
                    String str2 = strArr3[i4];
                    bbpeVar.aE(4);
                    bbpeVar.e = str2;
                }
                if (strArr4 != null) {
                    String str3 = strArr4[i4];
                    bbpeVar.aE(5);
                    bbpeVar.f = str3;
                }
                if (strArr5 != null) {
                    String str4 = strArr5[i4];
                    bbpeVar.aE(6);
                    bbpeVar.g = str4;
                }
                if (strArr != null) {
                    String str5 = strArr[i4];
                    bbpeVar.aE(7);
                    bbpeVar.h = str5;
                }
                if (strArr7 != null) {
                    String str6 = strArr7[i4];
                    bbpeVar.aE(8);
                    bbpeVar.i = str6;
                }
                bbpc bbpcVar = new bbpc();
                bbpcVar.aC(bbpeVar.aB());
                i = length;
                bbpcVar.a = bbpeVar.a;
                bbpcVar.b = bbpeVar.b;
                bbpcVar.c = bbpeVar.c;
                bbpcVar.d = bbpeVar.d;
                bbpcVar.e = bbpeVar.e;
                bbpcVar.f = bbpeVar.f;
                bbpcVar.g = bbpeVar.g;
                bbpcVar.h = bbpeVar.h;
                bbpcVar.i = bbpeVar.i;
                bbpcVar.cK = bbpeVar.aC();
                engrVar.h(bbpcVar);
            }
            i4++;
            length = i;
            dB = jArr;
            strArr6 = strArr;
        }
        return engrVar.g();
    }

    public final String g() {
        return getString(cM(8, bbqu.a));
    }

    public final String h() {
        return getString(cM(5, bbqu.a));
    }

    public final String i() {
        return getString(cM(7, bbqu.a));
    }

    public final String j() {
        return getString(cM(6, bbqu.a));
    }

    public final String k() {
        return getString(cM(4, bbqu.a));
    }

    public final String l() {
        return getString(cM(2, bbqu.a));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
