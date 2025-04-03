package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyfe extends eyfd {
    @Override // defpackage.eyfd
    public final eyfj a(Object obj) {
        return ((eyft) obj).r;
    }

    @Override // defpackage.eyfd
    public final eyfj b(Object obj) {
        return ((eyft) obj).a();
    }

    @Override // defpackage.eyfd
    public final void c(Object obj) {
        a(obj).f();
    }

    @Override // defpackage.eyfd
    public final void d(eyie eyieVar, Object obj, eyfc eyfcVar, eyfj eyfjVar) {
        eyfw eyfwVar = (eyfw) obj;
        eyfjVar.n(eyfwVar.d, eyieVar.t(eyfwVar.c.getClass(), eyfcVar));
    }

    @Override // defpackage.eyfd
    public final void e(eyes eyesVar, Map.Entry entry) {
        eyfv eyfvVar = (eyfv) entry.getKey();
        if (!eyfvVar.d) {
            eyjr eyjrVar = eyjr.DOUBLE;
            switch (eyfvVar.c) {
                case DOUBLE:
                    eyesVar.c(eyfvVar.b, ((Double) entry.getValue()).doubleValue());
                    break;
                case FLOAT:
                    eyesVar.g(eyfvVar.b, ((Float) entry.getValue()).floatValue());
                    break;
                case INT64:
                    eyesVar.j(eyfvVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case UINT64:
                    eyesVar.s(eyfvVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case INT32:
                    eyesVar.i(eyfvVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case FIXED64:
                    eyesVar.f(eyfvVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case FIXED32:
                    eyesVar.e(eyfvVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case BOOL:
                    eyesVar.a(eyfvVar.b, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case STRING:
                    eyesVar.q(eyfvVar.b, (String) entry.getValue());
                    break;
                case GROUP:
                    eyesVar.h(eyfvVar.b, entry.getValue(), eyib.a.a(entry.getValue().getClass()));
                    break;
                case MESSAGE:
                    eyesVar.k(eyfvVar.b, entry.getValue(), eyib.a.a(entry.getValue().getClass()));
                    break;
                case BYTES:
                    eyesVar.b(eyfvVar.b, (eyee) entry.getValue());
                    break;
                case UINT32:
                    eyesVar.r(eyfvVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case ENUM:
                    eyesVar.i(eyfvVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED32:
                    eyesVar.m(eyfvVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case SFIXED64:
                    eyesVar.n(eyfvVar.b, ((Long) entry.getValue()).longValue());
                    break;
                case SINT32:
                    eyesVar.o(eyfvVar.b, ((Integer) entry.getValue()).intValue());
                    break;
                case SINT64:
                    eyesVar.p(eyfvVar.b, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        eyjr eyjrVar2 = eyjr.DOUBLE;
        switch (eyfvVar.c) {
            case DOUBLE:
                eyil.t(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case FLOAT:
                eyil.x(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case INT64:
                eyil.A(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case UINT64:
                eyil.I(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case INT32:
                eyil.z(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case FIXED64:
                eyil.w(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case FIXED32:
                eyil.v(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case BOOL:
                eyil.r(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case STRING:
                eyil.G(eyfvVar.b, (List) entry.getValue(), eyesVar);
                break;
            case GROUP:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    eyil.y(eyfvVar.b, (List) entry.getValue(), eyesVar, eyib.a.a(list.get(0).getClass()));
                    break;
                }
                break;
            case MESSAGE:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    eyil.B(eyfvVar.b, (List) entry.getValue(), eyesVar, eyib.a.a(list2.get(0).getClass()));
                    break;
                }
                break;
            case BYTES:
                eyil.s(eyfvVar.b, (List) entry.getValue(), eyesVar);
                break;
            case UINT32:
                eyil.H(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case ENUM:
                eyil.z(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case SFIXED32:
                eyil.C(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case SFIXED64:
                eyil.D(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case SINT32:
                eyil.E(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
            case SINT64:
                eyil.F(eyfvVar.b, (List) entry.getValue(), eyesVar, eyfvVar.e);
                break;
        }
    }
}
