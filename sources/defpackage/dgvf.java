package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgvf {
    private static final Object a = new Object();
    private static volatile dgvc b;

    private dgvf() {
    }

    public static IInterface a(Context context, String str, dgve dgveVar) {
        dgvc dgvcVar = b;
        if (dgvcVar == null) {
            synchronized (a) {
                dgvcVar = b;
                if (dgvcVar == null) {
                    dgvcVar = b(context);
                    b = dgvcVar;
                }
            }
        }
        return dgvcVar.a(context, str, dgveVar);
    }

    private static dgvc b(Context context) {
        Class<?> loadClass;
        if (Log.isLoggable("brella.DynamiteLdr", 3)) {
            Log.d("brella.DynamiteLdr", "Trying to load fat dynamite loader");
        }
        try {
            loadClass = dgvf.class.getClassLoader().loadClass("com.google.android.gms.learning.internal.dynamite.FatDynamiteLoader");
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                Log.d("brella.DynamiteLdr", "Found fat DynamiteLoader impl: " + loadClass.getName());
            }
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                Log.d("brella.DynamiteLdr", "Falling back to trying to load default dynamite loader");
            }
            try {
                loadClass = dgvf.class.getClassLoader().loadClass("dgvb");
                if (Log.isLoggable("brella.DynamiteLdr", 3)) {
                    Log.d("brella.DynamiteLdr", "Found default DynamiteLoader impl: " + loadClass.getName());
                }
            } catch (ClassNotFoundException e) {
                String valueOf = String.valueOf(e.getMessage());
                boolean isLoggable = Log.isLoggable("brella.DynamiteLdr", 3);
                String concat = "No dynamite loader found: ".concat(valueOf);
                if (isLoggable) {
                    Log.d("brella.DynamiteLdr", concat, e);
                }
                throw new dgvd(concat, e);
            }
        }
        try {
            return (dgvc) loadClass.getConstructor(Context.class).newInstance(context);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            boolean isLoggable2 = Log.isLoggable("brella.DynamiteLdr", 3);
            String concat2 = "Failed to create dynamite loader instance: ".concat(valueOf2);
            if (isLoggable2) {
                Log.d("brella.DynamiteLdr", concat2, e2);
            }
            throw new dgvd(concat2, e2);
        }
    }
}
