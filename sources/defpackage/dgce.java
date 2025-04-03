package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Random;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgce {
    public static emcj a(Context context, byte[] bArr, emch emchVar) {
        Optional empty;
        final emci emciVar = (emci) emcj.a.createBuilder();
        eyee x = eyee.x(bArr);
        emciVar.copyOnWrite();
        emcj emcjVar = (emcj) emciVar.instance;
        emcjVar.b |= 2;
        emcjVar.d = x;
        emciVar.copyOnWrite();
        emcj emcjVar2 = (emcj) emciVar.instance;
        emchVar.getClass();
        emcjVar2.e = emchVar;
        emcjVar2.b |= 4;
        emcc emccVar = emcc.a;
        emciVar.copyOnWrite();
        emcj emcjVar3 = (emcj) emciVar.instance;
        emccVar.getClass();
        emcjVar3.f = emccVar;
        emcjVar3.b |= 8;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("dg_shared_preferences", 0);
            String string = sharedPreferences.getString("client_uuid", "");
            if (string.isEmpty()) {
                UUID randomUUID = UUID.randomUUID();
                sharedPreferences.edit().putString("client_uuid", randomUUID.toString()).apply();
                empty = Optional.of(randomUUID);
            } else {
                empty = Optional.of(UUID.fromString(string));
            }
        } catch (IllegalStateException unused) {
            empty = Optional.empty();
        }
        empty.map(new Function() { // from class: dgcc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                UUID uuid = (UUID) obj;
                return ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: dgcd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                eyee x2 = eyee.x((byte[]) obj);
                emci emciVar2 = emci.this;
                emciVar2.copyOnWrite();
                emcj emcjVar4 = (emcj) emciVar2.instance;
                emcj emcjVar5 = emcj.a;
                emcjVar4.b |= 16;
                emcjVar4.g = x2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (emcj) emciVar.build();
    }

    public static byte[] b(emcj emcjVar) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8];
            new Random().nextBytes(bArr);
            bArr[0] = 10;
            bArr[1] = 6;
            int i = 3;
            for (int i2 = 0; i2 < 8; i2++) {
                i ^= bArr[i2];
            }
            bArr[2] = (byte) (((byte) i) ^ bArr[2]);
            byteArrayOutputStream.write(bArr);
            emci emciVar = (emci) emcjVar.toBuilder();
            emciVar.copyOnWrite();
            emcj emcjVar2 = (emcj) emciVar.instance;
            emcjVar2.b &= -2;
            emcjVar2.c = emcj.a.c;
            ((emcj) emciVar.build()).writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
