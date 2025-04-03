package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emws extends emww {
    final /* synthetic */ String a = "";
    final /* synthetic */ emww b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emws(emww emwwVar, emww emwwVar2) {
        super(emwwVar2);
        this.b = emwwVar;
    }

    @Override // defpackage.emww
    public final CharSequence a(Object obj) {
        return obj == null ? this.a : this.b.a(obj);
    }
}
