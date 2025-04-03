package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import org.tensorflow.lite.support.text.tokenizers.SentencePieceTokenizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class won implements ffjm {
    public static final won a = new won();

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        FileInputStream fileInputStream = (FileInputStream) obj2;
        if (fileInputStream == null) {
            return null;
        }
        FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
        return new SentencePieceTokenizer(convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, convertMaybeLegacyFileChannelFromLibrary.size()));
    }
}
