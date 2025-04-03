package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxkr extends dtsr implements bxkf {
    @Deprecated
    public bxkr(dtve dtveVar, Cursor cursor, String[] strArr, dtzj[] dtzjVarArr, dtyo dtyoVar, dtvs dtvsVar, bxkx bxkxVar) {
        super(dtveVar, cursor, strArr, dtzjVarArr, bxle.a, dtyoVar, dtvsVar, bxkxVar);
    }

    @Override // defpackage.dtsr
    protected final /* synthetic */ dtro b() {
        return new bxjc();
    }

    public final long c() {
        return getLong(cM(0, bxle.a));
    }

    public final long e() {
        return getLong(cM(7, bxle.a));
    }

    public final akcd f() {
        byte[] blob = getBlob(cM(6, bxle.a));
        if (blob == null) {
            return null;
        }
        try {
            return (akcd) eyfy.parseFrom(akcd.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return akcd.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dtsr
    public final engw fI(dtvn dtvnVar) {
        Optional[] optionalArr;
        akdb[] akdbVarArr;
        akci[] akciVarArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        akcd[] akcdVarArr;
        long[] jArr;
        Instant[] instantArr3;
        Instant[] instantArr4;
        Instant[] instantArr5;
        Instant[] instantArr6;
        akcz[] akczVarArr;
        int i;
        int i2;
        Instant[] instantArr7;
        Instant[] instantArr8;
        akcz akczVar;
        akcd akcdVar;
        dtyq dtyqVar = dtvnVar.a;
        long[] dB = dB(getString(dtvnVar.h + 1));
        int length = dB.length;
        if (length == 0 || (length == 1 && dB[0] == -1)) {
            int i3 = engw.d;
            return enou.a;
        }
        HashSet hashSet = new HashSet();
        dtvs dtvsVar = this.d;
        boolean di = di(0);
        boolean z = dtvsVar.b;
        akcd akcdVar2 = null;
        long[] B = di ? z ? dtub.B(null, ds(getString(cM(0, bxle.a)))) : new long[]{c()} : null;
        dtsr.dy(length, B, new emyl() { // from class: bxkg
            @Override // defpackage.emyl
            public final Object get() {
                return "_id:".concat(String.valueOf(bxkr.this.getString(0)));
            }
        });
        if (!di(1)) {
            optionalArr = null;
        } else if (z) {
            String[] dt = dt(getString(cM(1, bxle.a)));
            int length2 = dt.length;
            Optional[] optionalArr2 = new Optional[length2];
            for (int i4 = 0; i4 < length2; i4++) {
                optionalArr2[i4] = bdhj.a(dt[i4]);
            }
            optionalArr = (Optional[]) dtub.C(null, optionalArr2, new Optional[0]);
        } else {
            optionalArr = new Optional[]{n()};
        }
        dtsr.dz(length, optionalArr, new emyl() { // from class: bxkj
            @Override // defpackage.emyl
            public final Object get() {
                return "session_id:".concat(String.valueOf(bxkr.this.getString(1)));
            }
        });
        if (!di(2)) {
            akdbVarArr = null;
        } else if (z) {
            int[] dr = dr(getString(cM(2, bxle.a)));
            akdb[] akdbVarArr2 = new akdb[dr.length];
            for (int i5 = 0; i5 < dr.length; i5++) {
                akdb b = akdb.b(dr[i5]);
                if (b == null) {
                    throw new IllegalStateException();
                }
                akdbVarArr2[i5] = b;
            }
            akdbVarArr = (akdb[]) dtub.C(null, akdbVarArr2, new akdb[0]);
        } else {
            akdbVarArr = new akdb[]{i()};
        }
        dtsr.dz(length, akdbVarArr, new emyl() { // from class: bxkk
            @Override // defpackage.emyl
            public final Object get() {
                return "feature:".concat(String.valueOf(bxkr.this.getString(2)));
            }
        });
        if (!di(3)) {
            akciVarArr = null;
        } else if (z) {
            int[] dr2 = dr(getString(cM(3, bxle.a)));
            akci[] akciVarArr2 = new akci[dr2.length];
            for (int i6 = 0; i6 < dr2.length; i6++) {
                akci b2 = akci.b(dr2[i6]);
                if (b2 == null) {
                    throw new IllegalStateException();
                }
                akciVarArr2[i6] = b2;
            }
            akciVarArr = (akci[]) dtub.C(null, akciVarArr2, new akci[0]);
        } else {
            akciVarArr = new akci[]{g()};
        }
        dtsr.dz(length, akciVarArr, new emyl() { // from class: bxkl
            @Override // defpackage.emyl
            public final Object get() {
                return "status:".concat(String.valueOf(bxkr.this.getString(3)));
            }
        });
        if (!di(4)) {
            instantArr = null;
        } else if (z) {
            long[] ds = ds(getString(cM(4, bxle.a)));
            int length3 = ds.length;
            Instant[] instantArr9 = new Instant[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                instantArr9[i7] = bdgw.b(ds[i7]);
            }
            instantArr = (Instant[]) dtub.C(null, instantArr9, new Instant[0]);
        } else {
            instantArr = new Instant[]{l()};
        }
        dtsr.dz(length, instantArr, new emyl() { // from class: bxkm
            @Override // defpackage.emyl
            public final Object get() {
                return "start_time:".concat(String.valueOf(bxkr.this.getString(4)));
            }
        });
        if (!di(5)) {
            instantArr2 = null;
        } else if (z) {
            long[] ds2 = ds(getString(cM(5, bxle.a)));
            int length4 = ds2.length;
            Instant[] instantArr10 = new Instant[length4];
            for (int i8 = 0; i8 < length4; i8++) {
                instantArr10[i8] = bdgw.b(ds2[i8]);
            }
            instantArr2 = (Instant[]) dtub.C(null, instantArr10, new Instant[0]);
        } else {
            instantArr2 = new Instant[]{j()};
        }
        dtsr.dz(length, instantArr2, new emyl() { // from class: bxkn
            @Override // defpackage.emyl
            public final Object get() {
                return "finish_time:".concat(String.valueOf(bxkr.this.getString(5)));
            }
        });
        if (!di(6)) {
            akcdVarArr = null;
        } else if (z) {
            List de = de(getString(cM(6, bxle.a)));
            akcd[] akcdVarArr2 = new akcd[de.size()];
            Iterator it = de.iterator();
            int i9 = 0;
            while (it.hasNext()) {
                try {
                    byte[] y = dtub.y((String) it.next());
                    int i10 = i9 + 1;
                    if (y == null) {
                        akcdVar = akcdVar2;
                    } else {
                        akcdVar = akcdVar2;
                        try {
                            akcdVar2 = (akcd) eyfy.parseFrom(akcd.a, y);
                        } catch (Throwable unused) {
                            i9 = i10;
                            akcdVarArr2[i9] = akcdVar;
                            i9++;
                            akcdVar2 = akcdVar;
                        }
                    }
                    akcdVarArr2[i9] = akcdVar2;
                    i9 = i10;
                } catch (Throwable unused2) {
                    akcdVar = akcdVar2;
                }
                akcdVar2 = akcdVar;
            }
            akcdVarArr = (akcd[]) dtub.C(akcdVar2, akcdVarArr2, new akcd[0]);
        } else {
            akcdVarArr = new akcd[]{f()};
        }
        dtsr.dz(length, akcdVarArr, new emyl() { // from class: bxko
            @Override // defpackage.emyl
            public final Object get() {
                return "backup_database_metadata:".concat(String.valueOf(bxkr.this.getString(6)));
            }
        });
        long[] B2 = di(7) ? z ? dtub.B(null, ds(getString(cM(7, bxle.a)))) : new long[]{e()} : null;
        dtsr.dy(length, B2, new emyl() { // from class: bxkp
            @Override // defpackage.emyl
            public final Object get() {
                return "initial_messages_version:".concat(String.valueOf(bxkr.this.getString(7)));
            }
        });
        if (!di(8)) {
            jArr = dB;
            instantArr3 = null;
        } else if (z) {
            long[] ds3 = ds(getString(cM(8, bxle.a)));
            int length5 = ds3.length;
            Instant[] instantArr11 = new Instant[length5];
            jArr = dB;
            for (int i11 = 0; i11 < length5; i11++) {
                instantArr11[i11] = bdgw.b(ds3[i11]);
            }
            instantArr3 = (Instant[]) dtub.C(null, instantArr11, new Instant[0]);
        } else {
            jArr = dB;
            instantArr3 = new Instant[]{m()};
        }
        dtsr.dz(length, instantArr3, new emyl() { // from class: bxkq
            @Override // defpackage.emyl
            public final Object get() {
                return "status_timestamp:".concat(String.valueOf(bxkr.this.getString(8)));
            }
        });
        if (!di(9)) {
            instantArr4 = instantArr2;
            instantArr5 = null;
        } else if (z) {
            long[] ds4 = ds(getString(cM(9, bxle.a)));
            int length6 = ds4.length;
            Instant[] instantArr12 = new Instant[length6];
            instantArr4 = instantArr2;
            for (int i12 = 0; i12 < length6; i12++) {
                instantArr12[i12] = bdgw.b(ds4[i12]);
            }
            instantArr5 = (Instant[]) dtub.C(null, instantArr12, new Instant[0]);
        } else {
            instantArr4 = instantArr2;
            instantArr5 = new Instant[]{k()};
        }
        dtsr.dz(length, instantArr5, new emyl() { // from class: bxkh
            @Override // defpackage.emyl
            public final Object get() {
                return "last_attachment_request_timestamp:".concat(String.valueOf(bxkr.this.getString(9)));
            }
        });
        if (!di(10)) {
            instantArr6 = instantArr5;
            akczVarArr = null;
        } else if (z) {
            List de2 = de(getString(cM(10, bxle.a)));
            akcz[] akczVarArr2 = new akcz[de2.size()];
            Iterator it2 = de2.iterator();
            int i13 = 0;
            while (it2.hasNext()) {
                try {
                    byte[] y2 = dtub.y((String) it2.next());
                    int i14 = i13 + 1;
                    if (y2 == null) {
                        instantArr8 = instantArr5;
                        akczVar = null;
                    } else {
                        instantArr8 = instantArr5;
                        try {
                            akczVar = (akcz) eyfy.parseFrom(akcz.a, y2);
                        } catch (Throwable unused3) {
                            i13 = i14;
                            akczVarArr2[i13] = null;
                            i13++;
                            instantArr5 = instantArr8;
                        }
                    }
                    akczVarArr2[i13] = akczVar;
                    i13 = i14;
                } catch (Throwable unused4) {
                    instantArr8 = instantArr5;
                }
                instantArr5 = instantArr8;
            }
            instantArr6 = instantArr5;
            akczVarArr = (akcz[]) dtub.C(null, akczVarArr2, new akcz[0]);
        } else {
            instantArr6 = instantArr5;
            akczVarArr = new akcz[]{h()};
        }
        dtsr.dz(length, akczVarArr, new emyl() { // from class: bxki
            @Override // defpackage.emyl
            public final Object get() {
                return "config:".concat(String.valueOf(bxkr.this.getString(10)));
            }
        });
        engr engrVar = new engr();
        int i15 = 0;
        while (i15 < length) {
            long j = jArr[i15];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                i = i15;
                i2 = length;
                instantArr7 = instantArr3;
            } else {
                hashSet.add(Long.valueOf(jArr[i15]));
                String[] strArr = bxle.a;
                bxjg bxjgVar = new bxjg();
                bxjgVar.aF();
                bxjgVar.aD();
                long j2 = jArr[i15];
                i = i15;
                i2 = length;
                if (B != null) {
                    long j3 = B[i];
                    bxjgVar.aE(0);
                    bxjgVar.a = j3;
                }
                if (optionalArr != null) {
                    bxjgVar.e(optionalArr[i]);
                }
                if (akdbVarArr != null) {
                    bxjgVar.c(akdbVarArr[i]);
                }
                if (akciVarArr != null) {
                    bxjgVar.g(akciVarArr[i]);
                }
                if (instantArr != null) {
                    bxjgVar.f(instantArr[i]);
                }
                if (instantArr4 != null) {
                    Instant instant = instantArr4[i];
                    bxjgVar.aE(5);
                    bxjgVar.f = instant;
                }
                if (akcdVarArr != null) {
                    akcd akcdVar3 = akcdVarArr[i];
                    bxjgVar.aE(6);
                    bxjgVar.g = akcdVar3;
                }
                instantArr7 = instantArr3;
                if (B2 != null) {
                    bxjgVar.d(B2[i]);
                }
                if (instantArr7 != null) {
                    bxjgVar.h(instantArr7[i]);
                }
                if (instantArr6 != null) {
                    Instant instant2 = instantArr6[i];
                    int i16 = bxjgVar.aB;
                    if (i16 < 60330) {
                        dtub.w("last_attachment_request_timestamp", i16);
                    }
                    bxjgVar.aE(9);
                    bxjgVar.j = instant2;
                }
                if (akczVarArr != null) {
                    bxjgVar.b(akczVarArr[i]);
                }
                engrVar.h(bxjgVar.a(new Supplier() { // from class: bxjd
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new bxjc();
                    }
                }));
            }
            instantArr3 = instantArr7;
            i15 = i + 1;
            length = i2;
        }
        return engrVar.g();
    }

    public final akci g() {
        return akci.b(getInt(cM(3, bxle.a)));
    }

    public final akcz h() {
        byte[] blob = getBlob(cM(10, bxle.a));
        if (blob == null) {
            return null;
        }
        try {
            return (akcz) eyfy.parseFrom(akcz.a, blob, eyfc.a());
        } catch (Throwable unused) {
            return akcz.a;
        }
    }

    public final akdb i() {
        return akdb.b(getInt(cM(2, bxle.a)));
    }

    public final Instant j() {
        return bdgw.b(getLong(cM(5, bxle.a)));
    }

    public final Instant k() {
        return bdgw.b(getLong(cM(9, bxle.a)));
    }

    public final Instant l() {
        return bdgw.b(getLong(cM(4, bxle.a)));
    }

    public final Instant m() {
        return bdgw.b(getLong(cM(8, bxle.a)));
    }

    public final Optional n() {
        return bdhj.a(getString(cM(1, bxle.a)));
    }

    @Override // defpackage.dtsu
    public final Cursor a() {
        return this;
    }
}
