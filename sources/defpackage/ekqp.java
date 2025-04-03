package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqp extends ekqt {
    public String a;
    public eyhs b;
    public ekqn c;
    private engw d;
    private Optional e = Optional.empty();

    @Override // defpackage.ekqt
    public final ekqu a() {
        eyhs eyhsVar;
        ekqn ekqnVar;
        if (this.d == null) {
            int i = engw.d;
            this.d = enou.a;
        }
        String str = this.a;
        if (str != null && (eyhsVar = this.b) != null && (ekqnVar = this.c) != null) {
            return new ekqq(str, this.d, eyhsVar, ekqnVar, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" schema");
        }
        if (this.c == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ekqt
    public final void b(ldq ldqVar) {
        this.e = Optional.of(ldqVar);
    }
}
