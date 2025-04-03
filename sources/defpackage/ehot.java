package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehot extends ehoi {
    final float a = -1.0f;

    @Override // defpackage.ehoi
    public final void a(ehpg ehpgVar, float f, float f2) {
        float f3 = f2 * f;
        ehpgVar.f(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        ehpc ehpcVar = new ehpc(0.0f, 0.0f, f4, f4);
        ehpcVar.e = 180.0f;
        ehpcVar.f = 90.0f;
        ehpgVar.f.add(ehpcVar);
        ehpgVar.b(new ehpa(ehpcVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        ehpgVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f7;
        ehpgVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
