package devloper.game.miochat.Fragments;


import devloper.game.miochat.Notifications.MyResponse;
import devloper.game.miochat.Notifications.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAbJ1iIdc:APA91bEGPbz3rUoMy07vpxVFeN1K21ry7Ptb-NEDqQyHHsGr25GBUO_0D3H-o_ODX36aLcxBV0ZRUIMvCRLOE3lW1N6I8QgEsAYSpRVD9i7sd5E0Zl8IjGbRVx9ZnBd2j2gy1tXW-fJw"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
