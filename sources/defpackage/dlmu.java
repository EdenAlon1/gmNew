package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmu extends dllp {
    public dlmu() {
        super(dexf.START_SERVICE, 10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dllp
    public final dllv a(dllv dllvVar, emxc emxcVar) {
        if (!emxcVar.g() || ((deyi) emxcVar.c()).b != 10) {
            throw new IllegalArgumentException();
        }
        deyi deyiVar = (deyi) emxcVar.c();
        deyf deyfVar = deyiVar.b == 10 ? (deyf) deyiVar.c : deyf.a;
        String packageName = dllvVar.b.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((deyfVar.b & 1) != 0) {
            intent.setAction(deyfVar.c);
        }
        if ((deyfVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, deyfVar.d));
        }
        for (int i = 0; i < deyfVar.e.size(); i++) {
            intent.addCategory((String) deyfVar.e.get(i));
        }
        for (dexv dexvVar : deyfVar.f) {
            int a = dexu.a(dexvVar.e);
            if (a == 0) {
                a = 1;
            }
            switch (a - 2) {
                case 0:
                    throw new IllegalArgumentException("Can't assign unknown extra");
                case 1:
                    intent.putExtra(dexvVar.d, dexvVar.b == 3 ? (String) dexvVar.c : "");
                    break;
                case 2:
                    intent.putExtra(dexvVar.d, (byte) (dexvVar.b == 4 ? ((Integer) dexvVar.c).intValue() : 0));
                    break;
                case 3:
                    intent.putExtra(dexvVar.d, (short) (dexvVar.b == 5 ? ((Integer) dexvVar.c).intValue() : 0));
                    break;
                case 4:
                    intent.putExtra(dexvVar.d, dexvVar.b == 6 ? ((Integer) dexvVar.c).intValue() : 0);
                    break;
                case 5:
                    intent.putExtra(dexvVar.d, dexvVar.b == 7 ? ((Long) dexvVar.c).longValue() : 0L);
                    break;
                case 6:
                    intent.putExtra(dexvVar.d, dexvVar.b == 8 ? ((Float) dexvVar.c).floatValue() : 0.0f);
                    break;
                case 7:
                    intent.putExtra(dexvVar.d, dexvVar.b == 9 ? ((Double) dexvVar.c).doubleValue() : eobe.a);
                    break;
                case 8:
                    intent.putExtra(dexvVar.d, dexvVar.b == 10 ? ((Boolean) dexvVar.c).booleanValue() : false);
                    break;
                case 9:
                    String[] strArr = new String[dexvVar.f.size()];
                    for (int i2 = 0; i2 < dexvVar.f.size(); i2++) {
                        strArr[i2] = (String) dexvVar.f.get(i2);
                    }
                    intent.putExtra(dexvVar.d, strArr);
                    break;
                case 10:
                    byte[] bArr = new byte[dexvVar.g.size()];
                    for (int i3 = 0; i3 < dexvVar.g.size(); i3++) {
                        bArr[i3] = (byte) dexvVar.g.d(i3);
                    }
                    intent.putExtra(dexvVar.d, bArr);
                    break;
                case 11:
                    short[] sArr = new short[dexvVar.h.size()];
                    for (int i4 = 0; i4 < dexvVar.h.size(); i4++) {
                        sArr[i4] = (short) dexvVar.h.d(i4);
                    }
                    intent.putExtra(dexvVar.d, sArr);
                    break;
                case 12:
                    int[] iArr = new int[dexvVar.i.size()];
                    for (int i5 = 0; i5 < dexvVar.i.size(); i5++) {
                        iArr[i5] = dexvVar.i.d(i5);
                    }
                    intent.putExtra(dexvVar.d, iArr);
                    break;
                case 13:
                    long[] jArr = new long[dexvVar.j.size()];
                    for (int i6 = 0; i6 < dexvVar.j.size(); i6++) {
                        jArr[i6] = dexvVar.j.a(i6);
                    }
                    intent.putExtra(dexvVar.d, jArr);
                    break;
                case 14:
                    float[] fArr = new float[dexvVar.k.size()];
                    for (int i7 = 0; i7 < dexvVar.k.size(); i7++) {
                        fArr[i7] = dexvVar.k.d(i7);
                    }
                    intent.putExtra(dexvVar.d, fArr);
                    break;
                case 15:
                    double[] dArr = new double[dexvVar.l.size()];
                    for (int i8 = 0; i8 < dexvVar.l.size(); i8++) {
                        dArr[i8] = dexvVar.l.d(i8);
                    }
                    intent.putExtra(dexvVar.d, dArr);
                    break;
                case 16:
                    boolean[] zArr = new boolean[dexvVar.m.size()];
                    for (int i9 = 0; i9 < dexvVar.m.size(); i9++) {
                        zArr[i9] = dexvVar.m.g(i9);
                    }
                    intent.putExtra(dexvVar.d, zArr);
                    break;
                default:
                    throw new IllegalArgumentException("Unrecognized extra type");
            }
        }
        List<ResolveInfo> queryIntentServices = dllvVar.b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        Log.i("START_SERVICE_FIX", "Starting service: intent=".concat(String.valueOf(String.valueOf(intent))));
        if (deyfVar.g) {
            dllvVar.b.startForegroundService(intent);
            return dllvVar;
        }
        dllvVar.b.startService(intent);
        return dllvVar;
    }

    @Override // defpackage.dllp
    public final String b() {
        return "START_SERVICE_FIX";
    }
}
