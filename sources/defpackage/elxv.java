package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elxv extends elyr {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;
    private final Optional e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final List i;

    public elxv(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, List list) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = optional5;
        this.f = optional6;
        this.g = optional7;
        this.h = optional8;
        this.i = list;
    }

    @Override // defpackage.elyr
    public final Optional a() {
        return this.e;
    }

    @Override // defpackage.elyv
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.elyv
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.elyr
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.elyr
    public final Optional e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elyr) {
            elyr elyrVar = (elyr) obj;
            if (this.a.equals(elyrVar.b()) && this.b.equals(elyrVar.c()) && this.c.equals(elyrVar.g()) && this.d.equals(elyrVar.h()) && this.e.equals(elyrVar.a()) && this.f.equals(elyrVar.d()) && this.g.equals(elyrVar.f()) && this.h.equals(elyrVar.e()) && this.i.equals(elyrVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.elyr
    public final Optional f() {
        return this.g;
    }

    @Override // defpackage.elyr
    public final Optional g() {
        return this.c;
    }

    @Override // defpackage.elyr
    public final Optional h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.elyr
    public final List i() {
        return this.i;
    }

    public final String toString() {
        List list = this.i;
        Optional optional = this.h;
        Optional optional2 = this.g;
        Optional optional3 = this.f;
        Optional optional4 = this.e;
        Optional optional5 = this.d;
        Optional optional6 = this.c;
        Optional optional7 = this.b;
        return "Schedule{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional7) + ", startDate=" + String.valueOf(optional6) + ", startTime=" + String.valueOf(optional5) + ", endDate=" + String.valueOf(optional4) + ", endTime=" + String.valueOf(optional3) + ", scheduleTimezone=" + optional2.toString() + ", repeatFrequency=" + optional.toString() + ", byDayList=" + list.toString() + "}";
    }
}
