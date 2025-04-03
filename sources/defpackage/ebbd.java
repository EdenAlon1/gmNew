package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbd extends ebar {
    public ebaq a;
    public ebaq b;
    public ebaq c;

    @Override // defpackage.ebar
    public final ebas a() {
        ebaq ebaqVar;
        ebaq ebaqVar2;
        ebaq ebaqVar3 = this.a;
        if (ebaqVar3 != null && (ebaqVar = this.b) != null && (ebaqVar2 = this.c) != null) {
            return new ebbe(ebaqVar3, ebaqVar, ebaqVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" myAccountClickListener");
        }
        if (this.b == null) {
            sb.append(" useAnotherAccountClickListener");
        }
        if (this.c == null) {
            sb.append(" manageAccountsClickListener");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
