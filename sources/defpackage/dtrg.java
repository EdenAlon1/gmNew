package defpackage;

import android.content.ContentValues;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtrg extends dtwd {
    public final dtui a;
    public final dtxc b;
    public final dtve c;
    public final boolean d;
    public final AtomicInteger e;
    public final AtomicLong f;
    public final AtomicLong g;
    public final AtomicBoolean h;
    public final dtyq i;
    private final emyl j;
    private final emyl k;
    private final String l;
    private final ContentValues m;

    public dtrg(dtui dtuiVar, dtxc dtxcVar, emyl emylVar, dtve dtveVar, boolean z, emyl emylVar2, AtomicInteger atomicInteger, AtomicLong atomicLong, AtomicLong atomicLong2, AtomicBoolean atomicBoolean, String str, ContentValues contentValues, dtyq dtyqVar) {
        this.a = dtuiVar;
        this.b = dtxcVar;
        this.j = emylVar;
        this.c = dtveVar;
        this.d = z;
        this.k = emylVar2;
        this.e = atomicInteger;
        this.f = atomicLong;
        this.g = atomicLong2;
        this.h = atomicBoolean;
        this.l = str;
        this.m = contentValues;
        this.i = dtyqVar;
    }

    @Override // defpackage.dtwd
    public final ContentValues a() {
        return this.m;
    }

    @Override // defpackage.dtwd
    public final dtui b() {
        return this.a;
    }

    @Override // defpackage.dtwd
    public final dtve c() {
        return this.c;
    }

    @Override // defpackage.dtwd
    public final dtxc d() {
        return this.b;
    }

    @Override // defpackage.dtwd
    public final dtyq e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        emyl emylVar;
        String str;
        ContentValues contentValues;
        dtyq dtyqVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtwd) {
            dtwd dtwdVar = (dtwd) obj;
            if (this.a.equals(dtwdVar.b()) && this.b.equals(dtwdVar.d()) && ((emylVar = this.j) != null ? emylVar.equals(dtwdVar.f()) : dtwdVar.f() == null) && this.c.equals(dtwdVar.c()) && this.d == dtwdVar.m() && this.k.equals(dtwdVar.g()) && this.e.equals(dtwdVar.j()) && this.f.equals(dtwdVar.l()) && this.g.equals(dtwdVar.k()) && this.h.equals(dtwdVar.i()) && ((str = this.l) != null ? str.equals(dtwdVar.h()) : dtwdVar.h() == null) && ((contentValues = this.m) != null ? contentValues.equals(dtwdVar.a()) : dtwdVar.a() == null) && ((dtyqVar = this.i) != null ? dtyqVar.equals(dtwdVar.e()) : dtwdVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dtwd
    public final emyl f() {
        return this.j;
    }

    @Override // defpackage.dtwd
    public final emyl g() {
        return this.k;
    }

    @Override // defpackage.dtwd
    public final String h() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        emyl emylVar = this.j;
        int hashCode2 = ((((((((((((((((hashCode * 1000003) ^ (emylVar == null ? 0 : emylVar.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        String str = this.l;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ContentValues contentValues = this.m;
        int hashCode4 = (hashCode3 ^ (contentValues == null ? 0 : contentValues.hashCode())) * 1000003;
        dtyq dtyqVar = this.i;
        return hashCode4 ^ (dtyqVar != null ? dtyqVar.hashCode() : 0);
    }

    @Override // defpackage.dtwd
    public final AtomicBoolean i() {
        return this.h;
    }

    @Override // defpackage.dtwd
    public final AtomicInteger j() {
        return this.e;
    }

    @Override // defpackage.dtwd
    public final AtomicLong k() {
        return this.g;
    }

    @Override // defpackage.dtwd
    public final AtomicLong l() {
        return this.f;
    }

    @Override // defpackage.dtwd
    public final boolean m() {
        return this.d;
    }

    public final String toString() {
        dtyq dtyqVar = this.i;
        ContentValues contentValues = this.m;
        AtomicBoolean atomicBoolean = this.h;
        AtomicLong atomicLong = this.g;
        AtomicLong atomicLong2 = this.f;
        AtomicInteger atomicInteger = this.e;
        emyl emylVar = this.k;
        dtve dtveVar = this.c;
        emyl emylVar2 = this.j;
        dtxc dtxcVar = this.b;
        return "MetaData{loggingTag=" + this.a.toString() + ", operationCategory=" + dtxcVar.toString() + ", canonicalSql=" + String.valueOf(emylVar2) + ", database=" + dtveVar.toString() + ", exemptFromQueryPlanChecking=" + this.d + ", sqlAndArgs=" + emylVar.toString() + ", resultCount=" + atomicInteger.toString() + ", threadTimeMillis=" + atomicLong2.toString() + ", elapsedTimeMillis=" + atomicLong.toString() + ", isInFlight=" + atomicBoolean.toString() + ", tableName=" + this.l + ", contentValuesForUpdate=" + String.valueOf(contentValues) + ", sourceQuery=" + String.valueOf(dtyqVar) + "}";
    }
}
