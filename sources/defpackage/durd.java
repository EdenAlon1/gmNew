package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class durd extends dutf {
    private final duqv a;
    private final engw b;
    private final Optional c;
    private final duqi e;
    private final errl f;
    private final Optional h;
    private final Optional i;
    private final boolean d = true;
    private final boolean g = true;

    public durd(duqv duqvVar, engw engwVar, Optional optional, boolean z, duqi duqiVar, errl errlVar, boolean z2, Optional optional2, Optional optional3) {
        this.a = duqvVar;
        this.b = engwVar;
        this.c = optional;
        this.e = duqiVar;
        this.f = errlVar;
        this.h = optional2;
        this.i = optional3;
    }

    @Override // defpackage.dutf
    public final duqi a() {
        return this.e;
    }

    @Override // defpackage.dutf
    public final duqv b() {
        return this.a;
    }

    @Override // defpackage.dutf
    public final engw c() {
        return this.b;
    }

    @Override // defpackage.dutf
    public final errl d() {
        return this.f;
    }

    @Override // defpackage.dutf
    public final Optional e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dutf) {
            dutf dutfVar = (dutf) obj;
            if (this.a.equals(dutfVar.b()) && ((engwVar = this.b) != null ? enkr.h(engwVar, dutfVar.c()) : dutfVar.c() == null) && this.c.equals(dutfVar.g())) {
                dutfVar.j();
                dutfVar.i();
                if (this.e.equals(dutfVar.a()) && this.f.equals(dutfVar.d())) {
                    dutfVar.h();
                    if (this.h.equals(dutfVar.e()) && this.i.equals(dutfVar.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dutf
    public final Optional f() {
        return this.i;
    }

    @Override // defpackage.dutf
    public final Optional g() {
        return this.c;
    }

    @Override // defpackage.dutf
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        engw engwVar = this.b;
        return (((((((((((((((engwVar == null ? 0 : engwVar.hashCode()) ^ (-139483682)) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ 1231) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 1231) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.dutf
    public final boolean i() {
        return true;
    }

    public final String toString() {
        return "EmojiPickerDataOptions{emojiPickerCoreDataOptions=EmojiPickerCoreDataOptions{recentEmojiProvider=null, itemFetchingTimeoutMs=0}, recentEmojiProviders=" + String.valueOf(this.b) + ", pageableItemProvider=" + this.c.toString() + ", imageLoader=null, stickyVariantsEnabled=true, emojiVariantsController=" + String.valueOf(this.e) + ", backgroundExecutor=" + String.valueOf(this.f) + ", saveToRecentAfterCommit=true, availableEmojis=" + this.h.toString() + ", emojiBlockList=" + this.i.toString() + "}";
    }

    @Override // defpackage.dutf
    public final void j() {
    }
}
