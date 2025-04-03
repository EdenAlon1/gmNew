package defpackage;

import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class citc extends ciwt {
    private final ciws a;
    private final CharSequence b;
    private final int c;
    private final IconCompat d;
    private final Optional e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private final Optional k;
    private final Optional l;
    private final Optional m;
    private final Optional n;
    private final Optional o;
    private final Optional p;
    private final Optional q;
    private final Optional r;
    private final Optional s;

    public citc(ciws ciwsVar, CharSequence charSequence, int i, IconCompat iconCompat, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, Optional optional12, Optional optional13, Optional optional14, Optional optional15) {
        this.a = ciwsVar;
        this.b = charSequence;
        this.c = i;
        this.d = iconCompat;
        this.e = optional;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.i = optional5;
        this.j = optional6;
        this.k = optional7;
        this.l = optional8;
        this.m = optional9;
        this.n = optional10;
        this.o = optional11;
        this.p = optional12;
        this.q = optional13;
        this.r = optional14;
        this.s = optional15;
    }

    @Override // defpackage.ciwt
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ciwt
    public final IconCompat b() {
        return this.d;
    }

    @Override // defpackage.ciwt
    public final ciws c() {
        return this.a;
    }

    @Override // defpackage.ciwt
    public final Optional d() {
        return this.q;
    }

    @Override // defpackage.ciwt
    public final Optional e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ciwt) {
            ciwt ciwtVar = (ciwt) obj;
            if (this.a.equals(ciwtVar.c()) && this.b.equals(ciwtVar.s()) && this.c == ciwtVar.a() && this.d.equals(ciwtVar.b()) && this.e.equals(ciwtVar.f()) && this.f.equals(ciwtVar.m()) && this.g.equals(ciwtVar.q()) && this.h.equals(ciwtVar.p()) && this.i.equals(ciwtVar.i()) && this.j.equals(ciwtVar.o()) && this.k.equals(ciwtVar.g()) && this.l.equals(ciwtVar.r()) && this.m.equals(ciwtVar.h()) && this.n.equals(ciwtVar.l()) && this.o.equals(ciwtVar.n()) && this.p.equals(ciwtVar.e()) && this.q.equals(ciwtVar.d()) && this.r.equals(ciwtVar.j()) && this.s.equals(ciwtVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ciwt
    public final Optional f() {
        return this.e;
    }

    @Override // defpackage.ciwt
    public final Optional g() {
        return this.k;
    }

    @Override // defpackage.ciwt
    public final Optional h() {
        return this.m;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode();
    }

    @Override // defpackage.ciwt
    public final Optional i() {
        return this.i;
    }

    @Override // defpackage.ciwt
    public final Optional j() {
        return this.r;
    }

    @Override // defpackage.ciwt
    public final Optional k() {
        return this.s;
    }

    @Override // defpackage.ciwt
    public final Optional l() {
        return this.n;
    }

    @Override // defpackage.ciwt
    public final Optional m() {
        return this.f;
    }

    @Override // defpackage.ciwt
    public final Optional n() {
        return this.o;
    }

    @Override // defpackage.ciwt
    public final Optional o() {
        return this.j;
    }

    @Override // defpackage.ciwt
    public final Optional p() {
        return this.h;
    }

    @Override // defpackage.ciwt
    public final Optional q() {
        return this.g;
    }

    @Override // defpackage.ciwt
    public final Optional r() {
        return this.l;
    }

    @Override // defpackage.ciwt
    public final CharSequence s() {
        return this.b;
    }

    public final String toString() {
        Optional optional = this.s;
        Optional optional2 = this.r;
        Optional optional3 = this.q;
        Optional optional4 = this.p;
        Optional optional5 = this.o;
        Optional optional6 = this.n;
        Optional optional7 = this.m;
        Optional optional8 = this.l;
        Optional optional9 = this.k;
        Optional optional10 = this.j;
        Optional optional11 = this.i;
        Optional optional12 = this.h;
        Optional optional13 = this.g;
        Optional optional14 = this.f;
        Optional optional15 = this.e;
        IconCompat iconCompat = this.d;
        return "NotificationStyleInfo{notificationStyle=" + this.a.toString() + ", titleText=" + ((String) this.b) + ", smallIconColor=" + this.c + ", smallIcon=" + iconCompat.toString() + ", contentTextV2=" + String.valueOf(optional15) + ", largeIconUri=" + String.valueOf(optional14) + ", ticker=" + String.valueOf(optional13) + ", subText=" + String.valueOf(optional12) + ", expandedContentText=" + String.valueOf(optional11) + ", messages=" + String.valueOf(optional10) + ", conversationInfo=" + String.valueOf(optional9) + ", userInfo=" + String.valueOf(optional8) + ", conversationTitle=" + String.valueOf(optional7) + ", isGroupConversation=" + String.valueOf(optional6) + ", lines=" + String.valueOf(optional5) + ", bigPictureUri=" + String.valueOf(optional4) + ", bigPictureAttachmentType=" + String.valueOf(optional3) + ", expandedLargeIconUri=" + String.valueOf(optional2) + ", expandedTitleText=" + String.valueOf(optional) + "}";
    }
}
