package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import j$.nio.channels.DesugarChannels;
import j$.util.Optional;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aczr b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aczq(ffgu ffguVar, aczr aczrVar, String str) {
        super(2, ffguVar);
        this.b = aczrVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aczq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            emhu emhuVar = (emhu) emhv.a.createBuilder();
            emhuVar.getClass();
            emhw emhwVar = (emhw) emhx.a.createBuilder();
            emhwVar.getClass();
            emhy.c(this.c, emhwVar);
            emhy.b("genai-models-group", emhwVar);
            emht.b(emhy.a(emhwVar), emhuVar);
            ListenableFuture d = this.b.a.d(emht.a(emhuVar));
            d.getClass();
            this.a = 1;
            obj = fgfz.c(d, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        String str = (String) fflm.b((Optional) obj);
        if (str == null) {
            return null;
        }
        String path = Uri.parse(ffpc.q(str, "android://", "file:///data/user/0/")).getPath();
        try {
            if (path == null) {
                throw new IllegalStateException("Invalid filepath when loading Emotify model");
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            try {
                FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                try {
                    MappedByteBuffer map = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, convertMaybeLegacyFileChannelFromLibrary.size());
                    map.load();
                    if (convertMaybeLegacyFileChannelFromLibrary != null) {
                        convertMaybeLegacyFileChannelFromLibrary.close();
                    }
                    randomAccessFile.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            throw new IllegalStateException("Error loading Model file", e);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aczq aczqVar = new aczq(ffguVar, this.b, this.c);
        aczqVar.d = obj;
        return aczqVar;
    }
}
