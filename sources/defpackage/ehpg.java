package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpg {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public ehpg() {
        e();
    }

    private final void g(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 <= 180.0f) {
            float f4 = this.b;
            float f5 = this.c;
            ehpc ehpcVar = new ehpc(f4, f5, f4, f5);
            ehpcVar.e = this.d;
            ehpcVar.f = f3;
            this.g.add(new ehpa(ehpcVar));
            this.d = f;
        }
    }

    final ehpf a(Matrix matrix) {
        g(this.e);
        return new ehoz(new ArrayList(this.g), new Matrix(matrix));
    }

    public final void b(ehpf ehpfVar, float f, float f2) {
        g(f);
        this.g.add(ehpfVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((ehpe) this.f.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        ehpd ehpdVar = new ehpd();
        ehpdVar.a = f;
        ehpdVar.b = f2;
        this.f.add(ehpdVar);
        ehpb ehpbVar = new ehpb(ehpdVar, this.b, this.c);
        b(ehpbVar, ehpbVar.b() + 270.0f, ehpbVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e() {
        f(0.0f, 270.0f, 0.0f);
    }

    public final void f(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
