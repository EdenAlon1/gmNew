package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sde extends sdl {
    public final sak a;
    public final saq b;
    public final emdl c;

    public sde(sak sakVar, emdl emdlVar, saq saqVar) {
        this.a = sakVar;
        this.c = emdlVar;
        this.b = saqVar;
    }

    @Override // defpackage.sdl
    public final sak a() {
        return this.a;
    }

    @Override // defpackage.sdl
    public final saq b() {
        return this.b;
    }

    @Override // defpackage.sdl
    public final emdl c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sdl) {
            sdl sdlVar = (sdl) obj;
            if (this.a.equals(sdlVar.a()) && this.c.equals(sdlVar.c()) && this.b.equals(sdlVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        saq saqVar = this.b;
        emdl emdlVar = this.c;
        return "SmartReplyServiceOptions{aiCoreClient=" + this.a.toString() + ", downloadCallback=" + emdlVar.toString() + ", feature=" + saqVar.toString() + "}";
    }
}
